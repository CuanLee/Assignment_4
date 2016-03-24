package ac.za.cput.assignment_4_1.TestInheritance;

import ac.za.cput.assignment_4_1.Inheritance.Rectangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestInheritance {

    private Rectangle rectangle;

    @Before
    public void setUp()
    {
        rectangle = new Rectangle(22,13,7);
    }

    @Test
    public void testArea()
    {
        Assert.assertEquals(286,rectangle.getArea(), 0.00);
    }

    @Test
    public void testPerimeter()
    {
        Assert.assertEquals(70,rectangle.getPerimeter(), 0.00);
    }

    @Test
    public void testVolume()
    {
        Assert.assertEquals(2002,rectangle.getVolume(), 0.00);
    }
}
