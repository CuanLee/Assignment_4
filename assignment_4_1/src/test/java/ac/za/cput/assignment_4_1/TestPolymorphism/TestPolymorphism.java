package ac.za.cput.assignment_4_1.TestPolymorphism;

import ac.za.cput.assignment_4_1.Polymorphism.CokeCanDetails;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestPolymorphism {

    private CokeCanDetails cokeCanDetails;

    @Before
    public void setUp()
    {
        cokeCanDetails = new CokeCanDetails(18,20,"coke01","Coke Cola Zero","Coke");
    }

    @Test
    public void testArea()
    {
        Assert.assertEquals(1017.36,cokeCanDetails.getArea(), 0.00);
    }

    @Test
    public void testPerimeter()
    {
        Assert.assertEquals(113.04,cokeCanDetails.getPerimeter(), 0.00);
    }

    @Test
    public void testVolume()
    {
        Assert.assertEquals(20347.20,cokeCanDetails.getVolume(), 0.00);
    }
}
