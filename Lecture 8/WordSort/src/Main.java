import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name:");
        String fileName = scan.nextLine();
        scan.close();

        ArrayList<String> allWords = readFromFile(fileName);
        ArrayList<String> sortedWords = sortWords(allWords);
        writeToFile("result.txt", sortedWords); 
    }

    public static ArrayList<String> readFromFile(String fileName) {
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            ArrayList<String> allWords = new ArrayList<>();
            while(fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] words = extractWords(line);
                addWords(allWords, words);
            }
            return allWords;
        } catch (IOException e) {
            System.out.println("Exception. " + e);
            return null;
        }
    }

    public static String[] extractWords(String line) {
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            words[i] = word.replaceAll("[^a-zA-Z]", "");
        }
        return words;
    }

    public static ArrayList<String> addWords(ArrayList<String> allWords, String[] words) {
        for (String word : words) {
            if (!(allWords.contains(word))) {
                allWords.add(word);
            }
        }
        return allWords;
    }

    public static ArrayList<String> sortWords(ArrayList<String> allWords) {
        Collections.sort(allWords);
        return allWords;
    }

    public static void writeToFile(String fileName, ArrayList<String> sortedWords) {
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            fileWriter.write("These are words originally contained in sample.txt" + "\n");
            fileWriter.write("The words have been ordered" + "\n");
            fileWriter.write("----------" + "\n");
            for (String word : sortedWords) {
                fileWriter.write(word + "\n");
            }
        } catch (IOException e) {
            System.out.println("Exception. " + e);
        }
    }   
}