package creational.prototype;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestPrototype
{
    public TestPrototype()
    {
        ShapeCache.loadCache();
    }

    @Test
    public void testCloneCircle()
    {
        Shape clonedCircle = ShapeCache.getShape("1");
        assertThat(clonedCircle.getType()).isEqualTo(ShapeType.CIRCLE);
    }

    @Test
    public void testCloneSquare()
    {
        Shape clonedSquare = ShapeCache.getShape("2");
        assertThat(clonedSquare.getType()).isEqualTo(ShapeType.SQUARE);

    }

    @Test
    public void testClonedRectangle()
    {
        Shape clonedRectangle = ShapeCache.getShape("3");
        assertThat(clonedRectangle.getType()).isEqualTo(ShapeType.RECTANGLE);
    }
}
