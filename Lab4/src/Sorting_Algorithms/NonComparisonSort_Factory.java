package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class NonComparisonSort_Factory<T extends Comparable<T>> extends SortFactory<T> {

    /*
     * !!!!!!!!!!!!! IMPORTANT NOTES - READ ME !!!!!!!!!!!!
     * The following applies on all of the sorting algorithms.
     * Take the unsorted arrayList as an input, return a list of lists
     * each list represents a STEP in the algorithm
     * the last element represents the SORTED ARRAY LIST.
     */

    @Override
    public Function<ArrayList<T>, ArrayList<ArrayList<T>>> getSortingAlgorithm(String algorithmName) {
        switch (algorithmName){
            case "Counting Sort":
                return this::countingSort;
            case "Radix Sort":
                return this::countingSort; // TODO: Change the returned function.
            default:
                break;
        }
        return null;
    }

    // Assigned To Mariam & George

    public ArrayList<ArrayList<T>> countingSort(ArrayList<T> in){
        if(in == null)
            return null;
        if(!in.isEmpty() && !(in.get(0) instanceof Integer))
            return null;
        in = (ArrayList<T>)in.clone();
        ArrayList<ArrayList<T>> steps = new ArrayList<>();
        ArrayList<Integer> input = (ArrayList<Integer>) in;
        int max = Collections.max(input), min = Collections.min(input);
        int[] countArray = new int[max - min + 1];
        T[] output = (T[]) new Comparable[input.size()];
        for (Integer integer : input) countArray[integer - min]++;
        for(int i = 1 ; i < countArray.length ; i++)
            countArray[i] += countArray[i - 1];
        for(int i = countArray.length - 1 ; i > 0 ; i--)
            countArray[i] = countArray[i - 1];
        countArray[0] = 0;
        for (Integer integer : input) {
            output[countArray[integer - min]++] = (T) integer;
            steps.add(new ArrayList<>(Arrays.asList(output)));
        }
        return steps;
    }

    public ArrayList<ArrayList<T>> radixSort(ArrayList<T> input){
        return null;
    }

}
