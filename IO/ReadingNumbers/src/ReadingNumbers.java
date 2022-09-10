import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class ReadingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter file name:");
        String fileName = scan.nextLine();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                int number = Integer.valueOf(fileReader.nextLine());
                list.add(number);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Lower bound?");
        int lower = scan.nextInt();
        scan.nextLine();
        System.out.println("Upper bound?");
        int upper = scan.nextInt();
        scan.nextLine();
        scan.close();

        for (int number : list) {
            if (number >= lower && number <= upper) {
                System.out.println(number);
            }
        }
    }
}
