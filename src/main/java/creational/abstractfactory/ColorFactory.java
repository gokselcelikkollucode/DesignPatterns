package creational.abstractfactory;

public class ColorFactory extends AbstractFactory
{
    @Override
    Color getColor(ColorType colorType)
    {
        switch (colorType)
        {
            case RED:
                return new Red();
            case BLUE:
                return new Blue();
            case GREEN:
                return new Green();
            default:
                return new DefaultColor();
        }
    }

    @Override
    Shape getShape(ShapeType shapeType)
    {
        return null;
    }
}
