package structural.decorator;

public class BlueShapeDecorator extends ShapeDecorator
{

    public BlueShapeDecorator(Shape decoratedShape)
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
       setBorderColor("Border Color Blue");
    }
}
