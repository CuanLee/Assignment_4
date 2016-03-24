package ac.za.cput.assignment_4_3.SRP.Obey;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestBankATMImplementation {

    private BankATMImplementation bankATMImplementation;

    @Before
    public void setUp()
    {
        bankATMImplementation = new BankATMImplementation(5000);
    }

    @Test
    public void testBalance()
    {
        Assert.assertEquals(5000, bankATMImplementation.getBalance(), 0.00);
    }

    @Test
    public void testDeposit()
    {
        Assert.assertEquals(20000, bankATMImplementation.deposit(15000), 0.00);
    }

    @Test
    public void testWithdrawal()
    {
        Assert.assertEquals(2000, bankATMImplementation.withdrawal(3000), 0.00);
    }
}
