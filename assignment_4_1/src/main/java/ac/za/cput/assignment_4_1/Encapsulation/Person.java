package ac.za.cput.assignment_4_1.Encapsulation;

/**
 * Created by Cuan on 3/24/2016.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private Integer age;

    public Person() {
    }

    public Person(String firstName, String lastName, String idNumber, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}
