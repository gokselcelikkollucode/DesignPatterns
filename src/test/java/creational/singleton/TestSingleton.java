package creational.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestSingleton
{
    @Test
    public void testA_EagerInitializedSingleton()
    {
        A_EagerInitializedSingleton singletonFirst = A_EagerInitializedSingleton.getInstance();
        A_EagerInitializedSingleton singletonSecond = A_EagerInitializedSingleton.getInstance();
        compareSingleton(singletonFirst, singletonSecond);
    }

    @Test
    public void testB_StaticBlockSingleton()
    {
        B_StaticBlockSingleton singletonFirst = B_StaticBlockSingleton.getInstance();
        B_StaticBlockSingleton singletonSecond = B_StaticBlockSingleton.getInstance();
        compareSingleton(singletonFirst, singletonSecond);
    }

    @Test
    public void testC_LazyInitializedSingleton()
    {
        C_LazyInitializedSingleton singletonFirst = C_LazyInitializedSingleton.getInstance();
        C_LazyInitializedSingleton singletonSecond = C_LazyInitializedSingleton.getInstance();
        compareSingleton(singletonFirst, singletonSecond);
    }

    @Test
    public void testD_ThreadSafeSingleton()
    {
        D_ThreadSafeSingleton singletonFirst = D_ThreadSafeSingleton.getInstance();
        D_ThreadSafeSingleton singletonSecond = D_ThreadSafeSingleton.getInstance();
        compareSingleton(singletonFirst, singletonSecond);
    }

    @Test
    public void testE_BillPughSingleton()
    {
        E_BillPughSingleton singletonFirst = E_BillPughSingleton.getInstance();
        E_BillPughSingleton singletonSecond = E_BillPughSingleton.getInstance();
        compareSingleton(singletonFirst, singletonSecond);
    }

    @Test
    public void testF_SerializedSingleton()
    {
        F_SerializedSingleton singletonFirst = F_SerializedSingleton.getInstance();
        F_SerializedSingleton singletonSecond = F_SerializedSingleton.getInstance();
        compareSingleton(singletonFirst, singletonSecond);
    }

    private void compareSingleton(Object singletonFirst, Object singletonSecond)
    {
        assertThat(singletonFirst.hashCode()).isEqualTo(singletonSecond.hashCode());
        assertThat(singletonFirst).isSameAs(singletonSecond);
    }
}
