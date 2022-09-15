
public abstract class Plant implements Growable{

    String plantType;
    int age;
    double value;
    boolean isFullyGrown;

    public String getPlantType() {
        return plantType;
    }

    public int getAge() {
        return age;
    }

    public double getValue() {
        return value;
    }

    public void grow(){
        this.isFullyGrown = true;
    }

    public boolean isFullyGrown() {
        return this.isFullyGrown;
    }
}