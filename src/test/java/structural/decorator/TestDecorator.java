package structural.decorator;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.Test;

public class TestDecorator
{
    @Test
    public void testRedShapeDecorator()
    {
        Shape redCircle = new RedShapeDecorator(new Circle());
        assertThat(redCircle.draw()).isEqualTo("Draw Circle, Border Color Red");
        System.out.println(redCircle.draw());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        assertThat(redRectangle.draw()).isEqualTo("Draw Rectangle, Border Color Red");
        System.out.println(redRectangle.draw());
    }

    @Test
    public void testBlueShapeDecorator()
    {
        Shape blueCircle = new BlueShapeDecorator(new Circle());
        assertThat(blueCircle.draw()).isEqualTo("Draw Circle, Border Color Blue");
        System.out.println(blueCircle.draw());

        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
        assertThat(blueRectangle.draw()).isEqualTo("Draw Rectangle, Border Color Blue");
        System.out.println(blueRectangle.draw());
    }
}
