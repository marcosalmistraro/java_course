import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;

public class Average {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter desired file");
        String fileName = scan.nextLine();
        scan.close();

        ArrayList<Integer> list = importFromFile(fileName);
        double avg = computeAverage(list);
        outputToFile(avg);
    }

    public static ArrayList<Integer> importFromFile(String fileName) {
        ArrayList<Integer> list = new ArrayList<>();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                list.add(Integer.valueOf(fileReader.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        return list;
    }

    public static double computeAverage(ArrayList<Integer> list) {
        double avg = list.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();
        return avg;
    }

    public static void outputToFile(double value) {
        try (FileWriter fileWriter = new FileWriter("output.txt", false)) {
            fileWriter.write("The calculated average is: \n");
            fileWriter.write(String.valueOf(value));
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}