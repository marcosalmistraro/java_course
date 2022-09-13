
public class Person {

    private String name;
    private int age;
    private boolean isMarried;

    public Person(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
    }

    public String getName() {
        return this.name;
    }

    public void marry(Person partner) {
        this.isMarried = true;
        partner.isMarried = true;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Married: " + isMarried;
    }

    public static void main(String[] args){
        Person harry = new Person("Harry", 20, false);
        Person mary = new Person("Mary", 35, false);
        System.out.println(harry);
        System.out.println(mary);
        harry.marry(mary);
        System.out.println(harry);
        System.out.println(mary);
    }
}