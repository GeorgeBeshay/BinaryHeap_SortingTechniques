package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(-1, -5, 0, 10, -100));
        ArrayList<ArrayList<Integer>> steps;

        SortFactory<Integer> sf = new SimpleSort_Factory<>();
        SortFactory<Integer> sf2 = new EfficientSort_Factory<>();
        SortFactory<Integer> sf3 = new HeapSort_Factory<>();
        SortFactory<Integer> sf4 = new NonComparisonSort_Factory<>();

        Function<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> myF =
                sf.getSortingAlgorithm("Insertion Sort");

        Function<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> myF2 =
                sf2.getSortingAlgorithm("Quick Sort");

        Function<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> myF3 =
                sf3.getSortingAlgorithm("Heap Sort");

        Function<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> myF4 =
                sf4.getSortingAlgorithm("Counting Sort");

        Function<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> myF5 =
                sf2.getSortingAlgorithm("Merge Sort");

        steps = myF.apply(myList);
        displaySteps(steps);

        System.out.println();

        steps = myF2.apply(myList);
        displaySteps(steps);

        System.out.println();

        steps = myF3.apply(myList);
        displaySteps(steps);

        System.out.println();

        steps = myF4.apply(myList);
        displaySteps(steps);

        System.out.println();

        steps = myF5.apply(myList);
        displaySteps(steps);
    }

    public static <T> void displaySteps(ArrayList<ArrayList<T>> list){
        for(ArrayList<T> step : list){
            for(T x : step)
                System.out.print(x + ", ");
            System.out.println();
        }
    }
}
