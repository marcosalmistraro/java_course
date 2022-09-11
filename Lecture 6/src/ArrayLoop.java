public class ArrayLoop {
    
    public static void main(String[] args) {

        int[] myArray = new int[]{2,6,8,1,9,0,10,23,7,5,3};

        for (int i = 0; i <= myArray.length - 1; i++) {
            if (myArray[i] % 2 == 0) {
                double result = 10.0/myArray[i];
                System.out.println(result);
            } else {
                System.out.println("This number is odd.");
            }   
        }
    }
}
