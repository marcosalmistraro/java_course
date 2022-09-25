
public class Programmer extends Employee{

    private String favoriteProgrammingLanguage;
    private int linesOfCodeWritten;

    public Programmer(String name, String gender, int employeeID, String favoriteProgrammingLanguage, int linesOfCodeWritten) {
        super(name, gender, employeeID);
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
        this.linesOfCodeWritten = linesOfCodeWritten;
    }

    public String toString() {
        return super.toString() + 
        "; loves " + favoriteProgrammingLanguage +
        " and has written " + linesOfCodeWritten + " lines of code";
    }
}