package structural.flyweight;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestFlyweight
{
    private static final ColorType colors[] = {ColorType.RED,
            ColorType.GREEN,
            ColorType.BLUE,
            ColorType.BLACK,
            ColorType.WHITE};

    @Test
    public void testFlyweight()
    {
        for (int i = 0; i < 20; i++)
        {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomXYRadius());
            circle.setY(getRandomXYRadius());
            circle.setRadius(getRandomXYRadius());
            System.out.println(circle.draw());
        }
        assertThat(ShapeFactory.mapSize()).isLessThan(6);
        System.out.println("Map Size: " + ShapeFactory.mapSize());
    }

    private static int getRandomXYRadius()
    {
        return (int) (Math.random() * 100);
    }

    private static ColorType getRandomColor()
    {
        return colors[(int) (Math.random() * colors.length)];
    }
}
