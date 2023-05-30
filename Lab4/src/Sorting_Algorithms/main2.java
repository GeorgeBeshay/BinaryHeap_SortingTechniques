package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;

public class main2 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,5,1,3));
        ArrayList<ArrayList<Integer>> steps;
        SortFactory<Integer> sf4 = new NonComparisonSort_Factory<>();
        BiFunction<ArrayList<Integer>, Boolean, ArrayList<ArrayList<Integer>>> myF4 =
                sf4.getSortingAlgorithm("Radix Sort");
        steps = myF4.apply(myList, true);
        System.out.println(steps);
    }
}
