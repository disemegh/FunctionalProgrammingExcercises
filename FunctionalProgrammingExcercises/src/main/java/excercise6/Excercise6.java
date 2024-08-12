package excercise6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Excercise6 {
    @FunctionalInterface
    interface Person<N, A, BD, R> {
        R apply(N n , A a, BD bd);
    }

    public static void main(String[] args) {
        BiFunction<LocalDate, Integer, Boolean> sameAge = (birthDate, age) -> {
            int calculatedAge = Period.between(birthDate, LocalDate.now()).getYears();
            return age.equals(calculatedAge);
        };

        Person<String, Integer, LocalDate, String> ageValidation = (name, age, birthDate) -> {
            String message = sameAge.apply(birthDate, age) ? "corresponds to the age" : "does not correspond to the age";
            return name + "'s date of birth " + message;
        };

        String result = ageValidation.apply("Diana", 30, LocalDate.of(1994, 1, 12));

        System.out.println(result);
    }
}
