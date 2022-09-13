import java.util.ArrayList;

public class OutOfMemoryError {
    
    public static void main(String[] args) {
        // the following block causes and catches an OutOfMemory error
        try{ArrayList<Integer> list = new ArrayList<>();
            int i = 0;
            while(true) {
                list.add(i);
                i++;
            }
        } catch (Error e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execution terminated - the error was caught.");
        }
    }
}