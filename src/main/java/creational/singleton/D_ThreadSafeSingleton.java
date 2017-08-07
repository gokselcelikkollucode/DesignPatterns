package creational.singleton;

/**
 * The easier way to create a thread-safe singleton class is to make the global access method synchronized, so that only one thread can execute this method at a time.
 * <p>
 * getInstance() implementation works fine and provides thread-safety but it reduces the performance because of cost associated with the synchronized method, although we need it
 * only for the first few threads who might create the separate instances (Read: Java Synchronization).
 * <p>
 * To avoid this extra overhead every time, double checked locking principle is used. In this approach, the synchronized block is used inside the if condition with an additional
 * check to ensure that only one instance of singleton class is created !!!Important!!! There are articles about DCL(Double checked locking) is not safe
 * //http://www.javaworld.com/article/2074979/java-concurrency/double-checked-locking--clever--but-broken.html !!!getInstance() is safer!!!
 */
public class D_ThreadSafeSingleton
{
    private static D_ThreadSafeSingleton instance;

    private D_ThreadSafeSingleton()
    {
    }

    public static synchronized D_ThreadSafeSingleton getInstance()
    {
        if (instance == null)
        {
            instance = new D_ThreadSafeSingleton();
        }
        return instance;
    }

    public static D_ThreadSafeSingleton getInstanceUsingDoubleLocking()
    {
        if (instance == null)
        {
            synchronized (D_ThreadSafeSingleton.class)
            {
                if (instance == null)
                {
                    instance = new D_ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
