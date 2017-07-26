package creational.abstractfactory;

public class FactoryProducer
{
    public static AbstractFactory getFactory(FactoryType factoryType)
    {
        switch (factoryType)
        {
            case COLOR:
                return new ColorFactory();
            case SHAPE:
                return new ShapeFactory();
            default:
                return null;
        }
    }
}
