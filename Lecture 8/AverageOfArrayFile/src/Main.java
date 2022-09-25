import java.util.Scanner;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = scan.nextLine();
        scan.close();

        ArrayList<Integer> list = new ArrayList<>();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                list.add(Integer.valueOf(fileReader.nextLine()));
            }

            String toWrite = "Average: " + average(list);
            System.out.println(toWrite);

            FileWriter fileWriter = new FileWriter(fileName, true);
            writeToFile(fileWriter, toWrite);
            
        } catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }

    public static double average(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        double average = sum*1.0/list.size();
        return average;
    }

    public static void writeToFile(FileWriter fileWriter, String toWrite){
        try(fileWriter) {
            fileWriter.write("\n" + toWrite);
        } catch (Exception e) {
            System.out.println("Exception :" + e.getMessage());
        }
    }
}