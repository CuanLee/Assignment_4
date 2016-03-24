package ac.za.cput.assignment_4_3.OCP.Obey;

/**
 * Created by Cuan on 3/24/2016.
 */
public class StandardBankCreditQualification {

    private ICreditCardStatus cardStatus;

    public StandardBankCreditQualification() {
        cardStatus = new Bank();
    }

    public String checkStatus(float salary)
    {
        return cardStatus.typeCard(salary);
    }
}
