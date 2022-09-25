
public class Program {

    public static void main(String[] args) {
        PersonalInfos<Employee> employees = new PersonalInfos<>();
        Programmer john = new Programmer("john", "male", 001, "Haskell", 1000);
        SalesPerson mary = new SalesPerson("mary", "nonbinary", 002, 9999);
        employees.add(john);
        employees.add(mary);
        employees.printall();

        PersonalInfos<Person> persons = new PersonalInfos<>();
        Person brody = new Person("cody", "male");
        Person eddie = new Person("eddie", "transgender");
        persons.add(brody);
        persons.add(eddie);
        persons.printall();
    }
}