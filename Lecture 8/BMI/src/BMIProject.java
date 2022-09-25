import java.util.Scanner;

public class BMIProject {
	public static void main(String [] args){
		// declare variables
		String name;
		double weight;
		double height;
		double BMI;
		
		// Ask the user for inputs
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter name");
		name = scan.nextLine();
		System.out.println("Please enter weight [kg]");
		weight = Double.valueOf(scan.nextLine());
		System.out.println("Please enter height [m]");
		height = Double.valueOf(scan.nextLine());
		scan.close();

		// calculate BMI
		BMI = calculateBMI(weight,height);
		
		// Here: Commands formatting the output and print to screen
		System.out.println("* Name: " + name);
		System.out.println("* Weight: " + weight);
		System.out.println("* Height: " + height);
		System.out.println("* Calculated BMI: " + BMI);
	}

	// method calculating BMI
	public static double calculateBMI(double w,double h) {
		double BMI = w/(h*h);
		return BMI;
	}
}