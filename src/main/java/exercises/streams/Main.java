package exercises.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        /*
        * Given a list of integers, find out all the even numbers
        * exist in the list using Stream functions
        * */
        List<Integer> listInt = Arrays.asList(10, 15, 8, 49, 57, 90);
        List<Integer> evenNumbers = listInt.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        /*
        * Given a list of integers, find out all the numbers
        * starting with 1 using Stream functions
        * */
        List<Integer> listInt2 = Arrays.asList(1, 29, 45, 6, 15, 23, 34, 100, 18);
        listInt2.stream()
                .filter(s -> String.valueOf(s).startsWith("1"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        breakingLine();

        /*
        * How to find duplicate elements in a given integers list
        * in java using Stream functions
        * */
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet();
        myList.stream()
                .filter(n -> !set.add(n))
                .forEach(System.out::println);
        //add returns true if element added successfully
        breakingLine();

        /*
        * Find all elements without duplicates
        * */
        List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set2 = new HashSet();
        myList.stream()
                .filter(n -> set2.add(n))
                .forEach(System.out::println);
        breakingLine();

        /*
        * Given the list of integers, find the first element
        * of the list using Stream functions
        * */
        List<Integer> myList3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        myList.stream()
//                .limit(1)
//                .forEach(System.out::println);
        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);
        breakingLine();

        /*
        * Given a list of integers, find the total number of elements present
        * in the list using Stream functions
        * */
        List<Integer> myList4 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long counter = myList4.stream().count();
        System.out.println(counter);
        breakingLine();

        /*
        * Given a list of integers, find the maximum value element
        * present in it using Stream functions
        * */
        List<Integer> myList5 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max = myList5.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(max);
        breakingLine();

        /*
        * Given a String, find the first non-repeated
        * character in it using Stream functions
        * */
        String word1 = "Some String Tutorial";
        Character result1 = word1.chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(entry -> entry.getKey())
                .findFirst()
                .get();
        System.out.println(result1);
        breakingLine();

        /*
         * Given a list of integers, sort all the values
         * present in it using Stream functions
         * */
        List<Integer> myList6 = Arrays.asList(10,15,8,49,25,98,98,32,15);
//        myList6.stream()
//                .sorted()
//                .forEach(System.out::println);
//
        myList6.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
        breakingLine();

        List<Integer> myList7 = Arrays.asList(-1, 0, 2, 0, 3, 6, -5, 0, 128);
        Comparator<Integer> zeroEndSorted = (a, b) -> a - b == a ? -1 : 0;
        List<Integer> sorted = myList7.stream()
                .sorted()
                .sorted(zeroEndSorted)
                .collect(Collectors.toList());
        System.out.println(sorted);
        breakingLine();
    }

    private static void breakingLine() {
        System.out.println("---------------------");
    }
}
