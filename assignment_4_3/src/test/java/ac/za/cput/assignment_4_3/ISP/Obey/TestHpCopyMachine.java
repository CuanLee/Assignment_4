package ac.za.cput.assignment_4_3.ISP.Obey;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestHpCopyMachine {

    private HPCopyMachine hpCopyMachine;

    @Before
    public void setUp()
    {
        hpCopyMachine = new HPCopyMachine();
    }

    @Test
    public void testCopyMachine()
    {
        Assert.assertEquals("HP MAchine Copying", hpCopyMachine.copy());
    }
}
