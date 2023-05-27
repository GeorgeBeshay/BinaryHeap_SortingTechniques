package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(-1, -5, 0, 10, -100));

        SortFactory<Integer> sf = new SimpleSort_Factory<>();
        SortFactory<Integer> sf2 = new EfficientSort_Factory<>();

        Function<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> myF =
                sf.getSortingAlgorithm("Insertion Sort");

        Function<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> myF2 =
                sf2.getSortingAlgorithm("Quick Sort");

        ArrayList<ArrayList<Integer>> steps = myF.apply((ArrayList<Integer>)(myList.clone()));
        displaySteps(steps);

        System.out.println();

        steps = myF2.apply((ArrayList<Integer>)(myList.clone()));
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
