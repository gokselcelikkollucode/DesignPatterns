package structural.privateclassdata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestPrivateClassData
{
    @Test
    public void testPrivateClassData()
    {
        int radius = 5;
        Circle circle = new Circle(radius, ColorType.RED, 10, 10);
        assertThat(circle.getCircumference()).isEqualTo(2 * Math.PI * 5);
        assertThat(circle.getArea()).isEqualTo(Math.PI * radius * radius);
    }
}
