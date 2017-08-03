package structural.facade;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestFacade
{
    private ShapeMaker shapeMaker;

    @Before
    public void setUp()
    {
        shapeMaker = new ShapeMaker();
    }

    @Test
    public void testFacade()
    {
        assertThat(shapeMaker.drawCircle()).isEqualTo("Draw Circle");
        System.out.println(shapeMaker.drawCircle());

        assertThat(shapeMaker.drawRectangle()).isEqualTo("Draw Rectangle");
        System.out.println(shapeMaker.drawRectangle());

        assertThat(shapeMaker.drawSquare()).isEqualTo("Draw Square");
        System.out.println(shapeMaker.drawSquare());
    }
}
