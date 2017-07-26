package creational.abstractfactory;

public abstract class AbstractFactory
{
    abstract Color getColor(ColorType colorType);
    abstract Shape getShape(ShapeType shapeType);
}
