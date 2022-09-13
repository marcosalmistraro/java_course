
import java.util.ArrayList;

public class MiniFarm {

    public String farmName;
    public String farmOwner;
    public ArrayList<Plant> plants;
    public ArrayList<Animal> animals;
    public double bankAccount;
    
    public MiniFarm(String farmName, String farmOwner, ArrayList<Plant> plants, ArrayList<Animal> animals) {
        this.farmName = farmName;
        this.farmOwner = farmOwner;
        this.plants = plants;
        this.animals = animals;
        this.bankAccount = 0;
    }

    public void feedAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void growPlants() {
        for (Plant plant : plants) {
            plant.grow();
        }
    }

    public void sellPlants() {
        double sum = 0;
        for (Plant plant : plants) {
            if (plant.isFullyGrown) {
                sum += plant.value;
            }
        }
        bankAccount += sum;
        plants.clear();
    }

    public void sellAnimals() {
        double sum = 0;
        for (Animal animal : animals) {
            if (!(animal.isHungry())) {
                sum += animal.value;
            }
        }
        bankAccount += sum;
        animals.clear();
    }

    @Override
    public String toString() {
        return "Farm Name: " + farmName + "\n" +
        "Owned by: " + farmOwner + "\n" +
        "Current Account balance: " + bankAccount; 
    }

    public static void main(String[] args) {

        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Carrot());
        plants.add(new Carrot());
        plants.add(new Rose());

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cow());
        int i = 0;
        while (i < 100) {
            animals.add(new Bee());
            i++;
        }

        MiniFarm myFarm = new MiniFarm("My farm", "Marco", plants, animals);
        System.out.println(myFarm);
        myFarm.feedAnimals();
        myFarm.growPlants();
        myFarm.sellAnimals();
        myFarm.sellPlants();
        System.out.println(myFarm);
    }
}