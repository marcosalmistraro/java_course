public class PersonAlternative {

    private String name;
    private int age;
    private PersonAlternative spouse;

    public PersonAlternative(String name, int age, PersonAlternative spouse) {
        this.name = name;
        this.age = age;
        this.spouse = spouse;
    }

    public PersonAlternative(String name, int age) {
        this(name, age, null);
    }

    public void marry(PersonAlternative spouse) {
        this.spouse = spouse;
    }

    public PersonAlternative createClone() {
        PersonAlternative clone = 
        new PersonAlternative(this.name, this.age, this.spouse);
        return clone;
    }

    @Override
    public String toString() {
        if (this.spouse == null) {
            return "Name: " + name + ", Age: " + age + ", unmarried";
        } else {
            return "Name: " + name + ", Age: " + age + 
        ", Married to: (" + spouse.name + ", " + spouse.age + " years old).";
        }
    }

    public static void main(String[] args) {
        PersonAlternative john = new PersonAlternative("John", 30);
        PersonAlternative mary = new PersonAlternative("Mary", 45);
        System.out.println(john);
        System.out.println(mary);
        john.marry(mary);
        PersonAlternative clone = john.createClone();
        System.out.println(clone);
    }
}