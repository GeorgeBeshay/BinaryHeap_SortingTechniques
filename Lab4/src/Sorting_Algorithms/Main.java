package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.*;
import java.util.random.*;

public class Main {

    private static final Random random = new Random();

    public static ArrayList<Integer> generateRandomList(int size) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < size; i++)
            temp.add(random.nextInt(1000000) - 500000);
        return temp;
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = generateRandomList(100);
        ArrayList<ArrayList<Integer>> steps;

        SortFactory<Integer> sf = new SimpleSort_Factory<>();
        SortFactory<Integer> sf2 = new EfficientSort_Factory<>();
        SortFactory<Integer> sf3 = new HeapSort_Factory<>();
        SortFactory<Integer> sf4 = new NonComparisonSort_Factory<>();

        BiFunction<ArrayList<Integer>, Boolean, ArrayList<ArrayList<Integer>>> myF =
                sf.getSortingAlgorithm("Insertion Sort");

        BiFunction<ArrayList<Integer>, Boolean, ArrayList<ArrayList<Integer>>> myF2 =
                sf2.getSortingAlgorithm("Quick Sort");

        BiFunction<ArrayList<Integer>, Boolean, ArrayList<ArrayList<Integer>>> myF3 =
                sf3.getSortingAlgorithm("Heap Sort");

        BiFunction<ArrayList<Integer>, Boolean, ArrayList<ArrayList<Integer>>> myF4 =
                sf4.getSortingAlgorithm("Counting Sort");

        BiFunction<ArrayList<Integer>, Boolean, ArrayList<ArrayList<Integer>>> myF5 =
                sf2.getSortingAlgorithm("Merge Sort");

        BiFunction<ArrayList<Integer>, Boolean, ArrayList<ArrayList<Integer>>> myF6 =
                sf4.getSortingAlgorithm("Radix Sort");

//        BiFunction<ArrayList<Integer>, Boolean, ArrayList<ArrayList<Integer>>> myF7 =
//                sf.getSortingAlgorithm("Bubble Sort");
//
//        BiFunction<ArrayList<Integer>, Boolean, ArrayList<ArrayList<Integer>>> myF8 =
//                sf.getSortingAlgorithm("Selection Sort");

        steps = myF.apply(myList, true);
        displaySteps(steps);

        System.out.println();

        steps = myF2.apply(myList, true);
        displaySteps(steps);

        System.out.println();

        steps = myF3.apply(myList, true);
        displaySteps(steps);

        System.out.println();

        steps = myF4.apply(myList, true);
        displaySteps(steps);

        System.out.println();

        steps = myF5.apply(myList, true);
        displaySteps(steps);

        System.out.println();

        steps = myF6.apply(myList, true);
        displaySteps(steps);

        System.out.println();

//        steps = myF7.apply(myList, true);
//        displaySteps(steps);
//
//        System.out.println();
//
//        steps = myF8.apply(myList, true);
//        displaySteps(steps);
//
//        System.out.println();
    }

    public static <T> void displaySteps(ArrayList<ArrayList<T>> list){
        for(ArrayList<T> step : list){
            for(T x : step)
                System.out.print(x + ", ");
            System.out.println();
        }
    }
}
