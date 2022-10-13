import java.util.ArrayList;
import java.util.Scanner;

public class SortPositives {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers to be added to the list");

        while(true) {
            String scannedValue = scan.nextLine();
            if(scannedValue.isEmpty()) {
                System.out.println("Done storing numbers");
                break;
            }
            int number = Integer.valueOf(scannedValue);
            numbers.add(number);
        }
        scan.close();

        sortPositives(numbers);

    }

    public static void sortPositives(ArrayList<Integer> numbers) {
        System.out.println("\nPrinting positives numbers after sorting");
        numbers.stream()
            .filter(n -> n >= 0)
            .sorted()
            .forEach(n -> System.out.println(n));
    }
}