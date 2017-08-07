package structural.decorator;

public class RedShapeDecorator extends ShapeDecorator
{
    public RedShapeDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }

    @Override
    public String draw()
    {
        setRedBorder();
        return super.draw();
    }

    private void setRedBorder()
    {
        setBorderColor("Border Color Red");
    }
}
