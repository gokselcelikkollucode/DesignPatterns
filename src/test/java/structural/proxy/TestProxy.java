package structural.proxy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestProxy
{
    private final String imageName = "venice_fest";

    @Test
    public void testProxy()
    {
        Image image = new ProxyImage(imageName);

        //image will be loaded from disk
        assertThat(image.display()).isEqualTo("Display " + imageName);
        System.out.println(image.display());

        System.out.println("");

        //image will not be loaded
        assertThat(image.display()).isEqualTo("Display " + imageName);
        System.out.println(image.display());
    }
}
