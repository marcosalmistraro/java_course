
public class Person implements PersonalizedPrint, CanSing{

    private String name;
    private String gender;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void prettyPrint() {
        System.out.println("*** NAME: "  + this.name + " ***");
    }

    public void sing() {
        System.out.println("La, la, la.");
    }

    public void makeNoiseOne() {
        System.out.println("Rrrrh");
    }

    public void makeNoiseTwo() {
        System.out.println("Mmmmh");
    }

    @Override
    public String toString() {
        return "This person is called " + name + " and has gender: " + gender;
    }

    public static void main(String[] args) {
        Person student = new Person("Max", "male");
        System.out.println(student);
        student.prettyPrint();
        student.sing();
        student.makeNoiseOne();
        student.makeNoiseTwo();
    }    
}