import java.util.Scanner;

public class PeopleNames {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] array = new String[5];

        for (int i = 0; i < array.length; i++)  {
            System.out.println("Enter name:");
            String input = scan.nextLine();
            array[i] = input;
        }

        scan.close();

        System.out.println("The name of the first person is: " + array[0]);
        System.out.println("The name of the second person is: " + array[1]);
        System.out.println("The name of the third person is: " + array[2]);
        System.out.println("The name of the fourth person is: " + array[3]);
        System.out.println("The name of the fifth person is: " + array[4]);
    }
}