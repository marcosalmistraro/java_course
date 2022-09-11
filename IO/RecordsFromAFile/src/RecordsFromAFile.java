import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class RecordsFromAFile {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter file name:");
        String fileName = scan.nextLine();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] fragments = row.split(",");
                names.add(fragments[0]);
                ages.add(Integer.valueOf(fragments[1]));
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.print("Name: " + names.get(i) + "; ");
            System.out.println("age: " + ages.get(i));
        }
        scan.close();
    }
}
