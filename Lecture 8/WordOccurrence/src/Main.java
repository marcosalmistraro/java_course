import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        String fileName = "sample.txt";
        ArrayList<String> words = findWords(fileName);
        HashMap<String, Integer> hashmap = countOccurrencies(words);
        printHashMap(hashmap);
    }

    public static ArrayList<String> findWords(String fileName) {
        ArrayList<String> words = new ArrayList<>();

        try(Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] lineWords = line.split(" ");
                for (String word : lineWords) {
                    word = word.replaceAll("[^a-zA-Z]", "");
                    words.add(word);
                }
            }
        } catch (IOException exception) {
            System.out.println("Exception: " + exception);
        }
        return words;
    }

    public static HashMap<String, Integer> countOccurrencies(ArrayList<String> words) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        Set<String> wordsSet = new HashSet<>(words);
        for (String word : wordsSet) {
            int count = 0;
            for (int j = 0; j < words.size(); j++) {
                if (word.equals(words.get(j))) {
                    count++;
                }
            }
            hashmap.put(word, count);
        }
        return hashmap;
    }

    public static void printHashMap(HashMap<String, Integer> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println("-----");
            System.out.println("Key: " + key);
            System.out.println("Value: " + hashmap.get(key));
            System.out.println("-----");
        }
    }
}