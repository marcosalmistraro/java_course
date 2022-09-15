
public abstract class Animal implements Feedable{

    String animalType;
    int age;
    double value;
    boolean isHungry;

    public String getAnimalType() {
        return animalType;
    }

    public int getAge() {
        return age;
    }

    public double getValue() {
        return value;
    }

    public void feed(){
        this.isHungry = false;
    }

    public boolean isHungry() {
        return this.isHungry;
    } 
}