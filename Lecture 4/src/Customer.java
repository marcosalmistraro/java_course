public class Customer {

    private String name;
    private int age;
    private boolean isMarried;
    private int adultAge;

    public Customer(String name, int age, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.isMarried = isMarried;
        this.adultAge = 18;
    }

    public boolean isAdult() {
        return age >= adultAge;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + 
        ", Adult: " + isAdult() + ", Married: " + isMarried();
    }

    public static void main(String[] args) {
        Customer myFirstCustomer = new Customer("Maria", 19, false);
        System.out.println(myFirstCustomer);
    }

}