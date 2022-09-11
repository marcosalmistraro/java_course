public class Metrics {

    public static void main(String[] args) {
        int approximateMean = approximateMean(3.2, 4.9, 11.57);
        System.out.println(approximateMean);
    }

    public static int approximateMean(double first, double second, double third) {
        return (int) (first + second + third)/3;
    }
    
}
