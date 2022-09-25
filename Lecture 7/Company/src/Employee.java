
public abstract class Employee extends Person{

    private int employeeID;

    public Employee(String name, String gender, int employeeID) {
        super(name, gender);
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return super.toString() + "; employeeID: " + employeeID;
    }   
}