package others.shortcircuitevaluation;

public class ShortCircuitDemo
{
    public static void main(String[] args)
    {
        doWorkNormal1(3);
        doWorkNormal1(6);
        doWorkNormal1(8);
        System.out.println("\n\n");
        doWorkNormal2(3);
        doWorkNormal2(6);
        doWorkNormal2(8);
        System.out.println("\n\n");
        doWorkWithLazy(3);
        doWorkWithLazy(6);
        doWorkWithLazy(8);
    }

    public static void doWorkNormal1(int input)
    {
        System.out.println("Processing: " + input);
        int temp = compute(input);
        if (input > 5 && temp > 15)
        {
            System.out.println("Further processing with: " + temp);
        }
    }

    public static void doWorkNormal2(int input)
    {
        System.out.println("Processing: " + input);
        if (input > 5 && compute(input) > 15)
        {
            System.out.println("Further processing with: " + compute(input));
        }
    }

    /**
     * If compute() were expensive, we would not want to call it unnecessary.
     *
     * @param input
     */
    public static void doWorkWithLazy(int input)
    {
        Lazy<Integer> temp = new Lazy<>(() -> compute(input));
        System.out.println("Processing: " + input);
        if (input > 5 && temp.get() > 15)
        {
            System.out.println("Further processing with: " + temp.get());
        }
    }

    public static int compute(int number)
    {
        System.out.println("Assume expensive");
        return number * 2;
    }
}
