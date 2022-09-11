public class Factorial {

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n-1));
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {0, 1, 5, 10};
        int[] resultArray = new int[4];

        int i = 0;
        for (int number : inputArray) {
            int tmpResult = factorial(number);
            resultArray[i] = tmpResult;
            i++;
        }

        for (int result : resultArray) {
            System.out.println(result);
        }
    }
}
