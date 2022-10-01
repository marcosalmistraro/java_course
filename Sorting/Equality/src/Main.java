import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();

        while (true) {
            System.out.println("Entry identifier (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Entry name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Archive item = new Archive(identifier, name);
            if (!(items.contains(item))) {
                items.add(item);
            }
        }
        scanner.close();

        System.out.println("== Printing out unique items==");

        for (Archive entry : items) {
            System.out.println(entry.getIdentifier() + ": " + entry.getName());
        }
    }
}