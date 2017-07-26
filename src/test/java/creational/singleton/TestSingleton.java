package creational.singleton;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestSingleton
{
    @Test
    public void testSingleton()
    {
        Singleton singletonFirst = Singleton.getInstance();
        Singleton singletonSecond = Singleton.getInstance();
        assertThat(singletonFirst.hashCode()).isEqualTo(singletonSecond.hashCode());
        assertThat(singletonFirst).isSameAs(singletonSecond);
    }
}
