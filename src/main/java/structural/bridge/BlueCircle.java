package structural.bridge;

public class BlueCircle implements DrawAPI
{
    @Override
    public String drawCircle(int radius, int x, int y)
    {
        return "Drawing Circle [color: blue, radius: " + radius + ", x: " + x + ", y: " + y + "]";
    }
}
