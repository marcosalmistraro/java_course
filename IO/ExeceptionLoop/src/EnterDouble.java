import java.util.Scanner;

public class EnterDouble {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("Enter a double. It can't be equal to 0");

        try(Scanner scan = new Scanner(System.in)) {
            double input = Double.valueOf(scan.nextLine());

            if(input == 0) {
                throw new ArithmeticException();
            } else {
                System.out.println("The input is valid.");
                System.out.println("The number is equal to: " + input);
            }
        } catch (ArithmeticException ae) {
            System.out.println("The input can't be equal to 0");
        } finally {
            System.out.println("Execution terminated");
            System.exit(0);
        }
    }
}