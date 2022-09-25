import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> files = new ArrayList<>();
        files.add("elise.txt");
        files.add("enrique.txt");
        files.add("john.txt");
        // this won't be added to the list as contains implements the overriden equals methods
        files.add("john_sosia.txt"); 
        FileAnalyser fileAnalyser = new FileAnalyser(files);

        ArrayList<Person> people = fileAnalyser.buildList();

        for (Person person : people) {
            System.out.println(person);
        }
    }   
}