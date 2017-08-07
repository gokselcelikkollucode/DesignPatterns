package creational.singleton;

/**
 * Static block initialization implementation is similar to eager initialization, except that instance of class is created in the static block that provides option for exception
 * handling.
 * <p>
 * Both eager initialization and static block initialization creates the instance even before it’s being used and that is not the best practice to use. So in further sections, we
 * will learn how to create Singleton class that supports lazy initialization.
 */
public class B_StaticBlockSingleton
{
    private static B_StaticBlockSingleton instance;

    private B_StaticBlockSingleton()
    {
    }

    static
    {
        try
        {
            instance = new B_StaticBlockSingleton();
        }
        catch (Exception e)
        {
            throw new RuntimeException("Exception occure in creating singleton");
        }
    }

    public static B_StaticBlockSingleton getInstance()
    {
        return instance;
    }
}
