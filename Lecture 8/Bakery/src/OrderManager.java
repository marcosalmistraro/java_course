import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderManager {

    private ArrayList<Order> orders;
    private String fileName;

    public OrderManager(String fileName) {
        this.orders = new ArrayList<>();
        this.fileName = fileName;
    }

    public void run() {
        ArrayList<String> fileLines = extractInfo();
        sortOrders(fileLines);
        printOrders();
    }

    public ArrayList<String> extractInfo() {
        ArrayList<String> fileLines = new ArrayList<>();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                fileLines.add(fileReader.nextLine());
            }
            return fileLines;
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            return null;
        }
    }

    public void sortOrders(ArrayList<String> fileLines) {
        fileLines.remove(0);
        
        for (String line : fileLines) {
            String[] fragments = line.split(",");
            String name = fragments[0];
            int blueberry = Integer.valueOf(fragments[1].strip());
            int chocolate = Integer.valueOf(fragments[2]);
            int redVelvet = Integer.valueOf(fragments[3]);

            Order order = new Order(name, blueberry, chocolate, redVelvet);
            orders.add(order);
        }
    }

    public void printOrders() {
        System.out.println("The system contains the following orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}