import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PhoneBook {
    
    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String name, String number) {
        this.phoneBook.put(name, number);
    }

    public String find(String name) {
        return phoneBook.get(name);
    }

    public Set<String> getKeySet() {
        return phoneBook.keySet();
    }

    public SortedSet<String> getSortedKeySet() {
        SortedSet<String> sortedKeySet = new TreeSet<>();
        for (String name : getKeySet()) {
            sortedKeySet.add(name);
        }
        return sortedKeySet;
    }
}