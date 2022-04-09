package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //Create new Stream
        Stream<String> stream = Stream.of("a",
                "b", "c", "d");
        Stream<String> stream2 = Stream.of("e", "f", "g");

        //Convert existed array to Stream
        String[] array = new String[]{"a", "b", "c", "d"};
        Stream<String> streamArray = Arrays.stream(array);

        //For loop in one line
        stream.forEach(System.out::println);
        streamArray.forEach(System.out::println);

        //Match
//        boolean isOnList = stream2.anyMatch(item -> item.contains("e"));
//        System.out.println(isOnList);

        //Filter
        Stream<String> filteredItems = stream2.filter(item ->
                item.startsWith("f"));
        filteredItems.forEach(System.out::println);

        //Map
        List<Integer> numberList = new ArrayList<>(Arrays.asList(4, 2, 6, 9, 10, 17, 3));
        Stream<Integer> doubleNumbers = numberList.stream()
                .map(n -> n * n);
        doubleNumbers.forEach(System.out::println);

        //Collect
        List<Integer> doubledList = numberList.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        doubledList.forEach(System.out::println);
    }
}
