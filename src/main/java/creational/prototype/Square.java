package creational.prototype;

public class Square extends Shape
{
    public Square(){
        type = ShapeType.SQUARE;
    }

    @Override
    String draw()
    {
        return "Draw Square";
    }
}
