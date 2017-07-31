package others.lazyinitialization;
import others.lazyinitialization.lazy.HolderLazy;
import others.lazyinitialization.normal.HolderNormal;

public class LazyDemo
{
    public static void main(String[] args)
    {
        normalInitialization();
        System.out.println("\n");
        lazyInitialization();
    }

    public static void normalInitialization()
    {
        HolderNormal holder = new HolderNormal();
        Heavy heavy1 = holder.getHeavy();
        System.out.println(heavy1);
        Heavy heavy2 = holder.getHeavy();
        System.out.println(heavy2);
    }

    public static void lazyInitialization(){
        HolderLazy holder = new HolderLazy();
        Heavy heavy1 = holder.getHeavy();
        System.out.println(heavy1);
        Heavy heavy2 = holder.getHeavy();
        System.out.println(heavy2);
    }
}
