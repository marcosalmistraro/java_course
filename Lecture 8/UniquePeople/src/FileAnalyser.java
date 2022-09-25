import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

// add equals check //

public class FileAnalyser {

    private ArrayList<String> filenames;

    public FileAnalyser(ArrayList<String> filenames) {
        this.filenames = filenames;
    }

    public ArrayList<Person> buildList() {
        ArrayList<Person> people = new ArrayList<>();

        for (String filename : filenames) {
            try (Scanner fileReader = new Scanner(Paths.get(filename))) {
                while(fileReader.hasNextLine()) {
                    String[] info = fileReader.nextLine().split(",");

                    String StringAge = info[1];
                    int age = Integer.parseInt(StringAge);
                    Person newPerson = new Person(info[0], age, info[2]);
                    if (!(people.contains(newPerson))) {
                        people.add(newPerson);
                    }
                }
            } catch (IOException e) {
                System.out.println("Exception: " + e);
            } 
        }
        return people;
    }
}
