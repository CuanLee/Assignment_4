package ac.za.cput.assignment_4_3.ISP.Obey;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestSamsungScanner {
    private SamsungScanner samsungScanner;

    @Before
    public void setUp()
    {
        samsungScanner = new SamsungScanner();
    }

    @Test
    public void testScanner()
    {
        Assert.assertEquals("Scanner Scanning", samsungScanner.scan());
    }
}
