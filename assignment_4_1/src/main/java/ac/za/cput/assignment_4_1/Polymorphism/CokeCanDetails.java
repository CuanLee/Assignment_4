package ac.za.cput.assignment_4_1.Polymorphism;

/**
 * Created by Cuan on 3/24/2016.
 */
public class CokeCanDetails extends Circle{
    private String canCode;
    private String canDescription;
    private String sponsor;

    public CokeCanDetails() {
    }

    public CokeCanDetails(double radius, double height, String canCode, String canDescription, String sponsor) {
        super(radius, height);
        this.canCode = canCode;
        this.canDescription = canDescription;
        this.sponsor = sponsor;
    }

    public String getCanCode() {
        return canCode;
    }

    public void setCanCode(String canCode) {
        this.canCode = canCode;
    }

    public String getCanDescription() {
        return canDescription;
    }

    public void setCanDescription(String canDescription) {
        this.canDescription = canDescription;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String displayAreaDetails()
    {
        return "CokeCan Area = " + super.getArea();
    }

    public String displayPerimeterDetails()
    {
        return "CokeCan Perimeter = " + super.getPerimeter();
    }

    public String displayVolumeDetails()
    {
        return "CokeCan Volume = " + super.getVolume();
    }
}
