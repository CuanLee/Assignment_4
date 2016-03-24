package ac.za.cput.assignment_4_3.ISP.Violate;

/**
 * Created by Cuan on 3/24/2016.
 */
public class SamsungPrinter implements IMachine {

    @Override
    public String scan() {
        return "Samsung Printer Scanning";
    }

    @Override
    public String print() {
        return "Samsung Printer Printing";
    }

    @Override
    public String copy() {
        return "Samsung Printer Copying";
    }
}
