package structural.bridge;

public class GreenCircle implements DrawAPI
{
    @Override
    public String drawCircle(int radius, int x, int y)
    {
        return "Drawing Circle [color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]";
    }
}
