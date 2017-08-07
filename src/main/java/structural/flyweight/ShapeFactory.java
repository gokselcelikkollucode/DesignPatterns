package structural.flyweight;

import java.util.HashMap;

public class ShapeFactory
{
    private static final HashMap<ColorType, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(ColorType color)
    {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle with color: " + color.name());
        }
        return circle;
    }

    public static int mapSize()
    {
        return circleMap.size();
    }
}
