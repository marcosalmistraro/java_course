import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException{

        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);
        UI UI = new UI(phoneBook, scanner);

        while(true) {
            UI.displayOptions();
            String input = UI.read();

            if(input.equals("X")) {
                UI.terminateProgram();
                break;
            }

            if(input.equals("1")) {
                UI.addInfo();
            }

            if(input.equals("2")) {
                UI.findInfo();
            }

            if(input.equals("3")) {
                UI.printToFile();
            }
        }   
    }
}
