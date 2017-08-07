package structural.flyweight;


public class Circle implements Shape
{
    private ColorType color;
    private int x;
    private int y;
    private int radius;

    public Circle(ColorType color)
    {
        this.color = color;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    @Override
    public String draw()
    {
        return "Draw Circle [color: " + color.name() + ", x: " + x + ", y:" + y + ", radius:" + radius;
    }
}
