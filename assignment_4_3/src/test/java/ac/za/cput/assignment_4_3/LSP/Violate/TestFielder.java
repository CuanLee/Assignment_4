package ac.za.cput.assignment_4_3.LSP.Violate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestFielder {

    private Fielder fielder;

    @Before
    public void setUp()
    {
        fielder = new Fielder();
    }

    @Test
    public void testThrowBall()
    {
        Assert.assertEquals(true, fielder.throwBall());
    }

    @Test
    public void testCatchBall()
    {
        Assert.assertEquals(true, fielder.throwBall());
    }
}
