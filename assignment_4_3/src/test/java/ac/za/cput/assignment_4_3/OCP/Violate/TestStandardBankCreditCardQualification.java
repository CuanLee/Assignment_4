package ac.za.cput.assignment_4_3.OCP.Violate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestStandardBankCreditCardQualification {
    private StandardBankCreditStatus standardBankCreditQualification;

    @Before
    public void setUp()
    {
        standardBankCreditQualification = new StandardBankCreditStatus();
    }

    @Test
    public void testBlueCard()
    {
        Assert.assertEquals("Blue Card", standardBankCreditQualification.blueCard());
    }

    @Test
    public void testSilverCard()
    {
        Assert.assertEquals("Silver Card", standardBankCreditQualification.silverCard());
    }

    @Test
    public void testGoldCard()
    {
        Assert.assertEquals("Gold Card", standardBankCreditQualification.goldCard());
    }
}
