import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class InFile {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name:");
        String fileName = scan.nextLine();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file" + fileName + " failed");
        }

        while(true) {
            System.out.println("Enter name to look for:");
            String name = scan.nextLine();
            if (name.isEmpty()){
                break;
            }
            if (list.contains(name)) {
                System.out.println("The person named " + name + " is on the list");
            } else {
                System.out.println("The person named " + name + " is NOT on the list");
            }
        }
        System.out.println("Execution terminated.");
        scan.close();
    }
}