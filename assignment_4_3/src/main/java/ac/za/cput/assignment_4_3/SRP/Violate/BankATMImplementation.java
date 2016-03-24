package ac.za.cput.assignment_4_3.SRP.Violate;

/**
 * Created by Cuan on 3/24/2016.
 */
public class BankATMImplementation implements BankATM {
    private float balance;

    public BankATMImplementation(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public float withdrawal(float amount) {
        return balance - amount;
    }

    @Override
    public float deposit(float amount) {
        return balance + amount;
    }

    @Override
    public float payForHoliday(float amount) {
        if(balance > amount)
            return -1;
        else
            return balance - amount;
    }
}
