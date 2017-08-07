package creational.singleton;

import java.io.Serializable;

/**
 * Sometimes in distributed systems, we need to implement Serializable interface in Singleton class so that we can store it’s state in file system and retrieve it at later point of
 * time. Here is a small singleton class that implements Serializable interface also.
 */
public class F_SerializedSingleton implements Serializable
{
    private static final long serialVersionUID = -7604766932017737114L;

    private F_SerializedSingleton()
    {
    }

    private static class SingletonHelper
    {
        private static final F_SerializedSingleton instance = new F_SerializedSingleton();
    }

    public static F_SerializedSingleton getInstance()
    {
        return SingletonHelper.instance;
    }

    /**
     * Write file and read is destroys the singleton pattern, to overcome this scenario all we need to do it provide the implementation of readResolve() method.
     *
     * @return
     */
    private Object readResolve()
    {
        return SingletonHelper.instance;
    }
}
