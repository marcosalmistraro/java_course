
public class MeanOfFive {

    public static float meanOfArray(float[] array) {
        float sum = 0;
        for (float number : array) {
            sum += number;
        }
        return sum/array.length;
    }

    public static void main(String[] args) {
        float[] array = new float[]{1.2f, 2.3f, 4.5f, 6.98f, 10.234f};
        float meanOfArray = meanOfArray(array);
        System.out.println("The calculate mean of the given array of floats is: " + meanOfArray);
    }   
}