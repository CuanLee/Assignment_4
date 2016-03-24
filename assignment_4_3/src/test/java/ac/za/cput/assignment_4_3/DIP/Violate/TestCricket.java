package ac.za.cput.assignment_4_3.DIP.Violate;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestCricket {
    private Cricket cricket;

    @Before
    public void setUp()
    {
        cricket = new Cricket();
    }

    @Test
    public void testMethod()
    {
        Assert.assertEquals("Cricket Ball thrown", cricket.throwCricketBall());
    }
}
