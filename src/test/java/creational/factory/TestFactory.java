package creational.factory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestFactory
{
    private ShapeFactory shapeFactory;

    @Before
    public void setUp()
    {
        //create shape factory
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void testSquare()
    {
        //get an object of Shape Square
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        //assert shape Square
        assertThat(square).isNotNull();
        assertThat(square).isInstanceOf(Square.class);
        assertThat(square.draw()).isEqualTo("Draw Square");
    }

    @Test
    public void testCircle()
    {
        //get an object of Shape Circle
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        //assert shape Circle
        assertThat(circle).isNotNull();
        assertThat(circle).isInstanceOf(Circle.class);
        assertThat(circle.draw()).isEqualTo("Draw Circle");
    }

    @Test
    public void testRectangle()
    {
        //get an object of Shape Rectangle
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        //assert shape Rectangle
        assertThat(rectangle).isNotNull();
        assertThat(rectangle).isInstanceOf(Rectangle.class);
        assertThat(rectangle.draw()).isEqualTo("Draw Rectangle");
    }
}
