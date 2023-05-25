package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.function.Function;

public class SimpleSort_Factory<T extends Comparable<T>> extends SortFactory<T>{

    @Override
    public Function<ArrayList<T>, ArrayList<ArrayList<T>>> getSortingAlgorithm(String algorithmName) {
        switch (algorithmName){
            case "Selection Sort":
                // bla bla
                return this::selectionSort;
            case "Bubble Sort":
                // bla bla
                break;
            case "Insertion Sort":
                // bla bla
                break;
            default:
                break;
        }
        return null;
    }

    /*
     * !!!!!!!!!!!!! IMPORTANT NOTES - READ ME !!!!!!!!!!!!
     * The following applies on all of the sorting algorithms.
     * Take the unsorted arrayList as an input, return a list of lists
     * each list represents a STEP in the algorithm
     * the last element represents the SORTED ARRAY LIST.
     */

    // The below functions are assigned to >> Islam & Mkario

    public ArrayList<ArrayList<T>> selectionSort(ArrayList<T> input){
        System.out.println("In Selection Sort ...");
        // Implement Me
        return null;
    }

    public ArrayList<ArrayList<T>> bubbleSort(ArrayList<T> input){

        return null;
    }

    public ArrayList<ArrayList<T>> insertionSort(ArrayList<T> input){
        return null;
    }

}
