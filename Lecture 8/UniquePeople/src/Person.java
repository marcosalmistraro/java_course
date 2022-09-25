public class Person {
    
    private final String name;
    private final int age;
    private final String birthPlace;

    public Person(String name, int age, String birthPlace) {
        this.name = name;
        this.age = age;
        this.birthPlace = birthPlace;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    @Override
    public String toString() {
        String output = "Name: " + name + "\n";
        output += "Age: " + age + "\n";
        output += "Birthplace: " + birthPlace;
        return output;
    }

    @Override
    public boolean equals(Object person) {
        if (this == person) {
            return true;
        } else if (!(person instanceof Person)) {
            return false;
        }
        Person comparedPerson = (Person) person;
        String name = comparedPerson.getName();
        int age = comparedPerson.getAge();
        String birthPlace = comparedPerson.getBirthPlace();
        if (this.name.equals(name) && this.age == age && this.birthPlace.equals(birthPlace)) {
            return true;
        }
        return false;
    }
}
