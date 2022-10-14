import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter numbers to be stored");

        while(true) {
            String input = scan.nextLine();
            if(input.isEmpty()) {
                System.out.println("Done adding numbers to the list\n");
                break;
            }
            list.add(Integer.valueOf(input));
        }

        scan.close();

        ArrayList<Integer> divisibleList = storeDivisible(list);
        System.out.println(divisibleList);
        System.out.println("----------");
        printDivisible(list);
    }

    public static ArrayList<Integer> storeDivisible(ArrayList<Integer> list) {
        System.out.println("The following stored numbers are divisible by 3");
        ArrayList<Integer> divisibleList = list.stream()
                .filter(s -> s%3 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return divisibleList;
    }

    public static void printDivisible(ArrayList<Integer> list) {
        list.stream()
            .filter(s -> s%3 == 0)
            .forEach(s -> System.out.println(s));
    }   
}