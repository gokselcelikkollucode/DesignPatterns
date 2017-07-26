package creational.singleton;

public class Singleton
{
    private Singleton()
    {
    }

    private static class Singleton1Holer
    {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance()
    {
        return Singleton1Holer.INSTANCE;
    }
}
