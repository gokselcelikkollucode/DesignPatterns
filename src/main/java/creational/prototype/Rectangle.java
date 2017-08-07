package creational.prototype;

public class Rectangle extends Shape
{
    public Rectangle()
    {
        type = ShapeType.RECTANGLE;
    }

    @Override
    String draw()
    {
        return "Draw Rectangle";
    }
}
