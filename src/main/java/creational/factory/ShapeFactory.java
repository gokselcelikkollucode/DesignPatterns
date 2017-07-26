package creational.factory;

public class ShapeFactory
{
    public Shape getShape(ShapeType shapeType)
    {
        switch (shapeType)
        {
            case SQUARE:
                return new Square();
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            default:
                return new DefaultShape();
        }
    }
}
