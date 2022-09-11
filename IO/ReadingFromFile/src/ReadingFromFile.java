import java.util.Scanner;
import java.nio.file.Paths;

public class ReadingFromFile{

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(Paths.get("data.txt"))) {
            while (scan.hasNextLine()) {
                String row = scan.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}