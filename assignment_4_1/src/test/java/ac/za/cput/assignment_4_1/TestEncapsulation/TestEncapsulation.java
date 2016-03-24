package ac.za.cput.assignment_4_1.TestEncapsulation;

import ac.za.cput.assignment_4_1.Encapsulation.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Cuan on 3/24/2016.
 */
public class TestEncapsulation {
    private Person person;

    @Before
    public void setUp()
    {
        person = new Person("Cuan","Lee","9209245094089",23);
    }

    @Test
    public void TestEncapulation()
    {
        Assert.assertEquals("Cuan", person.getFirstName());
        Assert.assertEquals("Lee", person.getLastName());
        Assert.assertEquals("9209245094089", person.getIdNumber());
        Assert.assertEquals(23, person.getAge().longValue());
    }
}
