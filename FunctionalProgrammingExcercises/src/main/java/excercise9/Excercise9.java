package excercise9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Excercise9 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Diana", "Daniela", "Ana Maria", "Juliana", "Julian", "Felipe");

        Optional<List<String>> listOptional = Optional.of(filterList("ana", names));

        listOptional.ifPresent(x -> x.forEach(System.out::println));

    }
    private static List<String> filterList(String filter, List<String> names){
        return names.stream()
                .filter(name -> name.toLowerCase().contains(filter))
                .collect(Collectors.toList());
    }
}
