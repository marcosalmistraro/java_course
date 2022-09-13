
public class House {

    private int maxInhabitants;
    private Person[] inhabitants;

    public House(int maxInhabitants, Person[] inhabitants) {
        this.maxInhabitants = maxInhabitants;
        this.inhabitants = inhabitants;
    }

    @Override
    public String toString() {
        String string  =  "Maximum inhabitants: " + maxInhabitants + ", list: ";
        for (int i = 0; i < inhabitants.length-1; i++) {
            string += inhabitants[i].getName() + ", ";
        }
        string += inhabitants[inhabitants.length - 1].getName();
        return string;
       
    }

    public void assessLivingConditions() {
        if (inhabitants.length < maxInhabitants) {
            System.out.println("There is still room in the house.");
        } else if (inhabitants.length > maxInhabitants) {
            System.out.println("There are too many people living in the house.");
        } else {
            System.out.println("The house if full.");
        }
    }
    
    public static void main(String[] args) {
        Person mary = new Person("Mary", 20, false);
        Person john = new Person("John", 22, false);
        House house = new House(2, new Person[]{mary, john});
        System.out.println(house);
        house.assessLivingConditions();
    }
}