package creational.abstractfactory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestAbstractFactory
{
    private AbstractFactory shapeFactory;
    private AbstractFactory colorFactory;

    @Before
    public void setUp()
    {
        //get shape factory
        shapeFactory = FactoryProducer.getFactory(FactoryType.SHAPE);
        //get color factory
        colorFactory = FactoryProducer.getFactory(FactoryType.COLOR);
    }

    @Test
    public void testCircle()
    {
        //get an object of Shape CIRCLE
        Shape circle = shapeFactory.getShape(ShapeType.CIRCLE);
        //assert Shape CIRCLE
        assertThat(circle).isNotNull();
        assertThat(circle).isInstanceOf(Circle.class);
        assertThat(circle.draw()).isEqualTo("Draw CIRCLE");
    }

    @Test
    public void testRectangle()
    {
        //get an object of Shape Rectangle
        Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        //assert Shape Rectangle
        assertThat(rectangle).isNotNull();
        assertThat(rectangle).isInstanceOf(Rectangle.class);
        assertThat(rectangle.draw()).isEqualTo("Draw Rectangle");
    }

    @Test
    public void testSquare()
    {
        //get an object of Shape Square
        Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        //assert Shape Rectangle
        assertThat(square).isNotNull();
        assertThat(square).isInstanceOf(Square.class);
        assertThat(square.draw()).isEqualTo("Draw Square");
    }

    @Test
    public void testBlue()
    {
        //get an object of Color Blue
        Color blue = colorFactory.getColor(ColorType.BLUE);
        //assert Color Blue
        assertThat(blue).isNotNull();
        assertThat(blue).isInstanceOf(Blue.class);
        assertThat(blue.fill()).isEqualTo("Fill Blue");
    }

    @Test
    public void testRed()
    {
        //get an object of Color Red
        Color red = colorFactory.getColor(ColorType.RED);
        //assert Color Red
        assertThat(red).isNotNull();
        assertThat(red).isInstanceOf(Red.class);
        assertThat(red.fill()).isEqualTo("Fill Red");
    }

    @Test
    public void testGreen()
    {
        //get an object of Color Green
        Color green = colorFactory.getColor(ColorType.GREEN);
        //assert Color Green
        assertThat(green).isNotNull();
        assertThat(green).isInstanceOf(Green.class);
        assertThat(green.fill()).isEqualTo("Fill Green");
    }
}
