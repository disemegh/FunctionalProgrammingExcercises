package excercise5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;

public class Excercise5 {
    public static void main(String[] args) {
        BinaryOperator<BigDecimal> division = (x, y) -> x.divide(y, 2, RoundingMode.HALF_EVEN);

        BigDecimal number1 = BigDecimal.valueOf(10);
        BigDecimal number2 = BigDecimal.valueOf(2);
        BigDecimal result = division.apply(number1, number2);

        System.out.println(number1 + "/" + number2 + " = " + result);
    }
}
