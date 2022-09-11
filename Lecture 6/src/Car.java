
public class Car {
    public String brand;
    public double fuelConsumption;
    
    public Car(String brand, double fc){
        this.brand = brand;
        this.fuelConsumption = fc;
    }

    public String getBrand(){
        return brand;
    }

    public double getFuelConsumption(){
        return fuelConsumption;
    }
}