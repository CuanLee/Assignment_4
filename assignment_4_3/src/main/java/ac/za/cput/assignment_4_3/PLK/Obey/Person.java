package ac.za.cput.assignment_4_3.PLK.Obey;

/**
 * Created by Cuan on 3/24/2016.
 */
public class Person implements IPerson {
    private String name;
    private PreviousPartner previousPartner;

    public Person(String name, PreviousPartner previousPartner) {
        this.name = name;
        this.previousPartner = previousPartner;
    }

    @Override
    public String getFisrtName() {
        return name;
    }

    @Override
    public PreviousPartner getPartner() {
        return previousPartner;
    }
}
