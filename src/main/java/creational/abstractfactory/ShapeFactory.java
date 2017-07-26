package creational.abstractfactory;

public class ShapeFactory extends AbstractFactory
{
    @Override
    Color getColor(ColorType colorType)
    {
        return null;
    }

    @Override
    Shape getShape(ShapeType shapeType)
    {
        switch (shapeType)
        {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return new DefaultShape();
        }
    }
}
