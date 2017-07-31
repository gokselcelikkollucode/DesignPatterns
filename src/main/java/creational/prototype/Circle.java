package creational.prototype;

public class Circle extends Shape
{
    public Circle(){
        type = ShapeType.CIRCLE;
    }

    @Override
    String draw()
    {
        return "Draw Circle";
    }
}
