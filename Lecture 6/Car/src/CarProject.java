import java.util.Scanner;

public class CarProject {
    public static void main(String args []) {
        Car car1 = new Car("BMW", 7);

        // ask user how many miles he wants to drive
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many miles you want to drive");
        double miles = Double.valueOf(scan.nextLine());
        scan.close();
        
        // convert the miles to km
        DistanceConverter distConverter = new DistanceConverter();
        double km = distConverter.convert(miles);
        
        // calculate the liters fuel needed
        double litersFuel = (int) (km/100) * car1.getFuelConsumption();
        
        System.out.println("Driving " + miles + " miles with this " +
        car1.getBrand() + " will consume " + litersFuel + " liters of fuel.");
    }
}