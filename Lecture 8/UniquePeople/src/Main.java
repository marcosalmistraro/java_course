import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> files = new ArrayList<>();
        files.add("elise.txt");
        files.add("enrique.txt");
        files.add("john.txt");
        files.add("john_sosia.txt");
        FileAnalyser fileAnalyser = new FileAnalyser(files);

        ArrayList<Person> people = fileAnalyser.buildList();

        for (Person person : people) {
            System.out.println(person);
        }
    }
    
}
