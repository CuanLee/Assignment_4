package ac.za.cput.assignment_4_3.OCP.Obey;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestStandardBankCreditQualification {

    private StandardBankCreditQualification standardBankCreditQualification;

    @Before
    public void setUp()
    {
        standardBankCreditQualification = new StandardBankCreditQualification();
    }

    @Test
    public void testBlueCard()
    {
        Assert.assertEquals("Blue Card", standardBankCreditQualification.checkStatus(2000));
    }

    @Test
    public void testSilverCard()
    {
        Assert.assertEquals("Silver Card", standardBankCreditQualification.checkStatus(6001));
    }

    @Test
    public void testGoldCard()
    {
        Assert.assertEquals("Gold Card", standardBankCreditQualification.checkStatus(12000));
    }
}
