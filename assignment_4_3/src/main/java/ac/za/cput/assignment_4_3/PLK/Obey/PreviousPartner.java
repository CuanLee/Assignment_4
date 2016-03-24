package ac.za.cput.assignment_4_3.PLK.Obey;

/**
 * Created by Cuan on 3/24/2016.
 */
public class PreviousPartner {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Integer age;

    public PreviousPartner() {
    }

    public PreviousPartner(String firstName, String lastName, Gender gender, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
