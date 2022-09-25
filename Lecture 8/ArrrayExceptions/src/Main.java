import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        try {while(true) {
                System.out.println("Enter number to be added to array");
                String input = scan.nextLine();
                if (input.isBlank()) {
                    System.out.println("Done adding elements \n");
                    break;
                }
                int number = Integer.valueOf(input);
                list.add(number);
            }
            scan.close();

            System.out.println("Outputting numbers.. \n");
            for (int number : list) {
                System.out.println(number);
            } 
        } catch (Exception e) {
            System.out.println("Exception caught " + e.getMessage());
        }
    }
}