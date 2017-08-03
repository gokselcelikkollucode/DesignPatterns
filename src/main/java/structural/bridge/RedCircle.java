package structural.bridge;

public class RedCircle implements DrawAPI
{
    @Override
    public String drawCircle(int radius, int x, int y)
    {
        return "Drawing Circle [color: red, radius: " + radius + ", x: " + x + ", y: " + y +"]";
    }
}
