
public class SalesPerson extends Employee{

    private int itemsSold;

    public SalesPerson(String name, String gender, int employeeID, int itemsSold) {
        super(name, gender, employeeID);
        this.itemsSold = itemsSold;
    }

    @Override
    public String toString() {
        return super.toString() + "; items sold: " + itemsSold;
    }   
}