public class MyFunctions {

    public static int f(int x) {
        if (x == 0) {
            return -1;
        } else {
            int total = 1;
            int i = 1;
            while(i < x) {
                i++;
                total *= i;
            }
            return total;
        }
    }
    
    public static void main(String[] args) {
        int parameter = 4;
        int result = f(parameter);
        System.out.println("Result: " + result);
    }
}
