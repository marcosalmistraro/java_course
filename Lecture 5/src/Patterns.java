import javax.crypto.Mac;

public class Patterns {

    public static void upperTriangle(int rows) {
        int i = rows;
        while (i > 0) {
            int j = i;
            while(j > 0) {
                System.out.print("*");
                j--;
                
            }
            System.out.print("\n");
            i--;
        }
    }

    public static void lowerTriangle(int rows) {
        int i = 1;
        while (i <= rows) {
            int j = 1;
            while(j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }

    public static void diamond(int maxRow) {
        //upper diamond
        for (int i = 1; i <= maxRow; i+=2) {
            int NbBlankSpaces = (maxRow - i)/2;
            for (int blank = 1;  blank <= NbBlankSpaces; blank++){
            System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            for (int blank = 1;  blank <= NbBlankSpaces; blank++){
                System.out.print(" ");
                }
            System.out.print("\n");
        }
        //lower diamond
        for (int i = maxRow - 2; i >= 1; i-=2) {
            int NbBlankSpaces = (maxRow - i)/2;
            for (int blank = 1;  blank <= NbBlankSpaces; blank++){
            System.out.print(" ");
            }
            for (int stars = 1; stars <= i; stars++) {
                System.out.print("*");
            }
            for (int blank = 1;  blank <= NbBlankSpaces; blank++){
                System.out.print(" ");
                }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("UPPER TRIANGLE");
        System.out.println();
        upperTriangle(10);
        System.out.println();
        System.out.println("LOWER TRIANGLE");
        System.out.println();
        lowerTriangle(5);
        System.out.println();
        System.out.println("DIAMOND");
        System.out.println();
        diamond(13);
    }
}
