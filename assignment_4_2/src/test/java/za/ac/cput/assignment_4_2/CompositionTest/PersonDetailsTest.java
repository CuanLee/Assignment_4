package za.ac.cput.assignment_4_2.CompositionTest;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.assignment_4_2.PersonConfig.Composition.Gender;
import za.ac.cput.assignment_4_2.PersonConfig.Composition.GeographicalDetails;
import za.ac.cput.assignment_4_2.PersonConfig.Composition.PersonDetails;

/**
 * Created by Cuan on 3/24/2016.
 */
public class PersonDetailsTest {

    private PersonDetails personDetails;
    private GeographicalDetails geographicalDetails;

    @Before
    public void setUp()
    {
        geographicalDetails = new GeographicalDetails("Republic OF South Africa","Western Cape", "Cape Town", "Toon Way",11248);
        personDetails = new PersonDetails("Cuan", "Lee", Gender.Male, "9209245094089", geographicalDetails);
    }

    @Test
    public void testGetCountry()
    {
        Assert.assertEquals("Republic OF South Africa",personDetails.getGeographicalDetails().getCountry());
    }

    @Test
    public void testGetProvince()
    {
        Assert.assertEquals("Western Cape",personDetails.getGeographicalDetails().getProvince());
    }

    @Test
    public void testGetCity()
    {
        Assert.assertEquals("Cape Town",personDetails.getGeographicalDetails().getCity());
    }

    @Test
    public void testGetStreet()
    {
        Assert.assertEquals("Toon Way",personDetails.getGeographicalDetails().getStreet());
    }

    @Test
    public void testGetPostalCode()
    {
        Assert.assertEquals(11248,personDetails.getGeographicalDetails().getPostalCode().longValue());
    }

    @Test
    public void testGetFirstNameLastName()
    {
        Assert.assertEquals("Cuan Lee",personDetails.getFirstName() + " " + personDetails.getLastName());
    }
}
