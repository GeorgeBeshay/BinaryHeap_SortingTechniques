package Sorting_Algorithms;

import java.util.ArrayList;
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
        return null;
    }

    // Assigned To Mariam & George

    public ArrayList<ArrayList<T>> countingSort(ArrayList<T> input){
        return null;
    }

    public ArrayList<ArrayList<T>> radixSort(ArrayList<T> input){
        return null;
    }

}
