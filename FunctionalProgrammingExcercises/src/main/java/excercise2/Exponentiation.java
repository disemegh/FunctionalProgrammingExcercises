package excercise2;

import java.util.function.BiFunction;

public class Exponentiation {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> exponentiationFunction = Math::pow;

        double result = exponentiationFunction.apply(3, 3);

        System.out.println("Exponentiation result: " + result);

    }
}
