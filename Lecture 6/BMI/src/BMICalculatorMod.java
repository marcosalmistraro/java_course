import java.util.Scanner;

public class BMICalculatorMod {
    
    public static void main(String[] args){
        
        System.out.println("Insert your height:");
        try (Scanner scan = new Scanner(System.in)) {
            double height = scan.nextDouble();
            scan.nextLine();
            System.out.println("Insert your weight:");
            try {
                double weight = scan.nextDouble();
                scan.nextLine();
                double BMI = calculateBMI(weight, height);
            System.out.println("Your BMI is " + BMI + ".");
            } catch (Exception e) {
                System.out.println("Incorrect weight input.");
            }    
        } catch (Exception e) {
            System.out.println("Incorrect height input.");
        } finally {
            System.out.println("Program terminated.");
        }
    }

    public static double calculateBMI(double w, double h){
        double BMI;
        BMI = w/(h*h);
        return BMI;
    }
}