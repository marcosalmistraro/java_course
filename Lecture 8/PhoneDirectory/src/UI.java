import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UI {

    private PhoneBook phoneBook;
    private Scanner scanner;

    public UI(PhoneBook phoneBook, Scanner scanner) {
        this.phoneBook = phoneBook;
        this.scanner = scanner;
    }

    public String read() {
        return this.scanner.nextLine();
    }

    public static String getLine() {
        return "----------";
    }

    public void displayOptions() {
            System.out.println(getLine());
            System.out.println("Enter option: \n");
            System.out.println("1. Add contacts \n");
            System.out.println("2. Look up contacts \n");
            System.out.println("3. Write all contacts to specified file \n");
            System.out.println("X. Exit program");
            System.out.println(getLine());
    }

    public void terminateProgram() {
        System.out.println(getLine());
        System.out.println("Program terminated");
        System.out.println(getLine());
    }

    public void addInfo() {

        System.out.println(getLine());
        System.out.println("Enter name to be added:");
        System.out.println(getLine());
        String name = read();
        System.out.println(getLine());
        System.out.println("Enter associated number to be added:");
        System.out.println(getLine());
        String number = read();
        phoneBook.add(name, number);
    }

    public void findInfo() {

        System.out.println(getLine());
        System.out.println("Enter name of the person whose number you want to look for:");
        System.out.println(getLine());
        String name = read();
        if(phoneBook.getKeySet().contains(name)) {
            String number = phoneBook.find(name);
            System.out.println(getLine());
            System.out.println("Name: " + name + "\n");
            System.out.println("Number: " + number);
        } else {
            System.out.println(getLine());
            System.out.println("Name not found");
        }
    }

    public void printToFile() {

        System.out.println(getLine());
        System.out.println("Enter name of the file to write to:");
        System.out.println(getLine());
        String fileName = read();

        try(FileWriter fileWriter = new FileWriter(fileName, false)) {
            fileWriter.write("Phonebook" + "\n");
            
            for (String name : phoneBook.getSortedKeySet()) {
                fileWriter.write(getLine() + "\n");
                fileWriter.write("Name: " + name + "\n");
                fileWriter.write("Number: " + phoneBook.find(name) + "\n");
            }
            fileWriter.write(getLine() + "\n");
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}