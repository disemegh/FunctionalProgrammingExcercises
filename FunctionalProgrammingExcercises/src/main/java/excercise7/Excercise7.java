package excercise7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise7 {

    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>(2);
        LocalDate date1 = LocalDate.of(1994, 1, 12);
        LocalDate date2 = LocalDate.of(2024, 1, 12);
        dates.addAll(Arrays.asList(date1, date2));

        dates.forEach(Excercise7::printDates);
    }

    private static void printDates(LocalDate date) {
        System.out.println("The date is " + date.getDayOfMonth()+" of " + date.getMonth() + " of " + date.getYear());
    }


}
