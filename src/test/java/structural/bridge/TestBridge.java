package structural.bridge;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestBridge
{
    @Test
    public void testRedCircle()
    {
        Shape redCircle = new Circle(new RedCircle(), 10, 100, 100);
        assertThat(redCircle.draw()).isEqualTo("Drawing Circle [color: red, radius: 10, x: 100, y: 100]");
    }

    @Test
    public void testGreenCircle()
    {
        Shape redCircle = new Circle(new GreenCircle(), 7, 150, 150);
        assertThat(redCircle.draw()).isEqualTo("Drawing Circle [color: green, radius: 7, x: 150, y: 150]");
    }

    @Test
    public void testBlueCircle()
    {
        Shape redCircle = new Circle(new BlueCircle(), 5, 200, 200);
        assertThat(redCircle.draw()).isEqualTo("Drawing Circle [color: blue, radius: 5, x: 200, y: 200]");
    }
}
