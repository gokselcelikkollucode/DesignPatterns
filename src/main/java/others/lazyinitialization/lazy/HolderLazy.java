package others.lazyinitialization.lazy;

import others.lazyinitialization.Heavy;

public class HolderLazy
{
    Lazy<Heavy> heavy = new Lazy<>(() -> new Heavy());

    public HolderLazy()
    {
        System.out.println("Holder instance created");
    }

    public Heavy getHeavy()
    {
        System.out.println("Get Heavy Instance");
        return heavy.get();
    }
}
