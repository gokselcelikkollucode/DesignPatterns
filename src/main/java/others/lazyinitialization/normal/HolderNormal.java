package others.lazyinitialization.normal;

import others.lazyinitialization.Heavy;

public class HolderNormal
{
    private Heavy heavy = new Heavy();

    public HolderNormal()
    {
        System.out.println("Holder instance created");
    }

    public Heavy getHeavy()
    {
        System.out.println("Get Heavy Instance");
        return heavy;
    }
}
