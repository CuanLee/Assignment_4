package ac.za.cput.assignment_4_3.ISP.Violate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestSamsungPrinter {

    private SamsungPrinter samsungPrinter;

    @Before
    public void setUp()
    {
        samsungPrinter = new SamsungPrinter();
    }

    @Test
    public void testPrinter()
    {
        Assert.assertEquals("Samsung Printer Printing", samsungPrinter.print());
    }

    @Test
    public void testCopy()
    {
        Assert.assertEquals("Samsung Printer Copying", samsungPrinter.copy());
    }

    @Test
    public void testScan()
    {
        Assert.assertEquals("Samsung Printer Scanning", samsungPrinter.scan());
    }
}
