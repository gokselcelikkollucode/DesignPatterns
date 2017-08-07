package structural.privateclassdata;

public class CircleData
{
    private int radius;
    private ColorType color;
    private int x;
    private int y;

    public CircleData(int radius, ColorType color, int x, int y)
    {
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public int getRadius()
    {
        return radius;
    }

    public ColorType getColor()
    {
        return color;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}
