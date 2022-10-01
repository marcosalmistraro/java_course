import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rounding {

    public static void main(String[] args) {
        
        // BigDecimal objects are immutable, once instantiated
        BigDecimal input1 = new BigDecimal(0.12345);
        BigDecimal input2 = new BigDecimal(0.23456);

        input1 = input1.setScale(2, RoundingMode.DOWN);
        input2 = input2.setScale(3, RoundingMode.UP);

        System.out.println(input1);
        System.out.println(input2);
    }
}