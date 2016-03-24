package ac.za.cput.assignment_4_3.ISP.Obey;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestDellPrinter {

    private DellPrinter dellPrinter;

    @Before
    public void setUp()
    {
        dellPrinter = new DellPrinter();
    }

    @Test
    public void testPrinter()
    {
        Assert.assertEquals("Dell Printer Printing",dellPrinter.print());
    }
}
