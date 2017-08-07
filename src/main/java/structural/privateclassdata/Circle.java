package structural.privateclassdata;

public class Circle
{
    private CircleData circleData;

    public Circle(int radius, ColorType color, int x, int y)
    {
        this.circleData = new CircleData(radius, color, x, y);
    }

    public double getCircumference()
    {
        return 2 * Math.PI * circleData.getRadius();
    }

    public double getArea()
    {
        return Math.PI * circleData.getRadius() * circleData.getRadius();
    }
}
