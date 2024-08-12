package excercise3;

import java.util.function.Predicate;

public class OddNumber {

    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x % 2 == 1;

        boolean result1 = oddNumber.test(1);
        boolean result2 = oddNumber.test(2);

        System.out.println("1 es impar? " + result1);
        System.out.println("2 es impar? " + result2);
    }
}
