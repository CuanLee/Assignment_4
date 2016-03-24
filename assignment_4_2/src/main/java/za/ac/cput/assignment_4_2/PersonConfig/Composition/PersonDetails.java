package za.ac.cput.assignment_4_2.PersonConfig.Composition;

/**
 * Created by Cuan on 3/24/2016.
 */
public class PersonDetails {
    private String firstName;
    private String lastName;
    private Gender gender;
    private String idNumber;
    private GeographicalDetails geographicalDetails;

    public PersonDetails() {
    }

    public PersonDetails(String firstName, String lastName, Gender gender, String idNumber, GeographicalDetails geographicalDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.idNumber = idNumber;
        this.geographicalDetails = geographicalDetails;
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public GeographicalDetails getGeographicalDetails() {
        return geographicalDetails;
    }

    public void setGeographicalDetails(GeographicalDetails geographicalDetails) {
        this.geographicalDetails = geographicalDetails;
    }

    @Override
    public String toString() {
        return "PersonDetails{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", idNumber='" + idNumber + '\'' +
                ", geographicalDetails=" + geographicalDetails +
                '}';
    }
}
