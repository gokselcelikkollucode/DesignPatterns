package structural.decorator;

public abstract class ShapeDecorator implements Shape
{
    protected Shape decoratedShape;
    private String borderColor;

    public ShapeDecorator(Shape decoratedShape)
    {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public String draw()
    {
        return decoratedShape.draw() + ", " +borderColor;
    }

    public String getBorderColor()
    {
        return borderColor;
    }

    public void setBorderColor(String borderColor)
    {
        this.borderColor = borderColor;
    }
}
