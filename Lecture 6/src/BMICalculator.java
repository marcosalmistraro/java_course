// simple class for calculating a person's BMI

public class BMICalculator {
    
    public static void main(String[] args){
        double weight = 60;
        double height = 1.70;
        double BMI = calculateBMI(weight, height);
        System.out.println("Your BMI is " + BMI + ".");
    }

    public static double calculateBMI(double w, double h){
        double BMI;
        BMI = w/(h*h);
        return BMI;
    }
}
