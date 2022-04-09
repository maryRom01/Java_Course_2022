package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>(Arrays.asList("Student1", "Student2"));

        // Consumer
        students.forEach(s -> System.out.println(s));
        //or
        Consumer<String> printItem = n -> System.out.println(n);
        students.forEach(printItem);

        //Function
        Function<Integer, Integer> doubly = n -> n * n;
        System.out.println(doubly.apply(7));

        //Predicate
        IntPredicate isDivByThree = n -> n % 3 == 0;
        System.out.println(isDivByThree.test(9));
        System.out.println(isDivByThree.test(10));

        //Supplier
        Supplier<Double> randomNumberUnder100 = () -> Math.random() * 100;
        System.out.println(randomNumberUnder100.get());
    }
}
