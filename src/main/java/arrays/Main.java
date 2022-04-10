package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Declare an array
        int[] nums;

        //Declare and allocate an array
        double[] numsDouble = new double[5];

        //Declare, allocate and init an array
        String[] availablePets = {"cat", "dog", "fish"};

        System.out.println(Arrays.toString(availablePets));

        //Find the maximum product of two numbers in unsorted array
        List<Integer> array = Arrays.asList(3, 2, 5, 7, 0);
        System.out.println(maximumProduct(array));

        List<Integer> array2 = Arrays.asList(-2, -1, -3, 4, -8, 0);
        System.out.println(maximumProduct(array2));

        System.out.println(maximumProduct2(array));

        //Find the maximum product of two numbers in unsorted array
        //and return the pair of indices
        System.out.println(Arrays.toString(maximumProductIndices(array)));
        System.out.println(Arrays.toString(maximumProductIndices(array2)));
    }

    private static int maximumProduct(List<Integer> array) {
        array.sort(Comparator.reverseOrder());
        if (array.get(array.size() - 1) < 0)
        {
            return array.get(array.size() - 1)
                    * array.get(array.size() -2);
        } else {
            return array.get(0) * array.get(1);
        }
    }

    private static int[] maximumProductIndices(List<Integer> array) {
        array.sort(Comparator.reverseOrder());
        if (array.get(array.size() - 1) < 0) {
            return (new int[]{array.size() - 1, array.size() - 2});
        } else {
            return (new int[]{0, 1});
        }
    }

    private static int maximumProduct2(List<Integer> array) {
        int length = array.size();
        int max = Integer.MIN_VALUE;

        if (length < 2) {
            System.out.println("No maximum exists");
            return max;
        }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array.get(i) * array.get(j) > max) {
                    max = array.get(i) * array.get(j);
                }
            }
        }
        return max;
    }
}
