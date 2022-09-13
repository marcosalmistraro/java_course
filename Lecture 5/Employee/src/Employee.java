
public class Employee {

    private String employeeType;
    private int yearsWithCompany;

    public Employee(String employeeType, int yearsWithCompany) {
        this.employeeType = employeeType;
        this.yearsWithCompany = yearsWithCompany;
    }

    public double calculateWage() {
        int baseWage = 0;
        if (employeeType.equals("CLERK")){
            baseWage = 1000;
        } else if (employeeType.equals("MIDLEVELMANAGER")) {
            baseWage = 2000;
        } else if (employeeType.equals("CIO") || employeeType.equals("CFO")) {
            baseWage = 3000;
        } else if (employeeType.equals("CEO")) {
            baseWage = 5000;
        }
        double wage = baseWage * yearsWithCompany * 0.1;
        return wage;
    }

    @Override
    public String toString() {
        return "Employee with function: " + employeeType;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("CIO", 11);
        double wage = employee.calculateWage();
        System.out.print(employee);
        System.out.print(". Wage: " + wage);
    }
}