package ac.za.cput.assignment_4_3.OCP.Obey;

/**
 * Created by Cuan on 3/24/2016.
 */
public class Bank implements ICreditCardStatus {

    @Override
    public String typeCard(float salary) {
        if (salary <= 6000)
            return "Blue Card";
        else if(salary <= 8000 && salary > 6000)
            return "Silver Card";
        else if (salary > 8000)
            return "Gold Card";
        else
            return "Do Not Qualify";
    }
}
