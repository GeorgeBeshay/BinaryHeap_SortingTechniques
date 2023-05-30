package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class SimpleSort_Factory<T extends Comparable<T>> extends SortFactory<T>{

    @Override
    public BiFunction<ArrayList<T>, Boolean, ArrayList<ArrayList<T>>> getSortingAlgorithm(String algorithmName) {
        switch (algorithmName) {
            case "Selection Sort" -> {
                return this::selectionSort;
            }
            case "Bubble Sort" -> {
                return this::bubbleSort;
            }
            case "Insertion Sort" -> {
                return this::insertionSort;
            }
            default -> {
            }
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

    public ArrayList<ArrayList<T>> selectionSort(ArrayList<T> input, boolean stepsRequired){
        // Declaring Variables
        input = (ArrayList<T>)input.clone();
        ArrayList<ArrayList<T>> steps = new ArrayList<>();
        steps.add((ArrayList<T>)input.clone());
        int smallestElementIndex;

        for(int i = 0 ; i < input.size() - 1 ; i++){
            smallestElementIndex = i;
            for(int j = i+1 ; j < input.size() ; j++){
                if(input.get(j).compareTo(input.get(smallestElementIndex)) < 0)
                    smallestElementIndex = j;
            }
            swap(input, i, smallestElementIndex);
            if(stepsRequired)
                steps.add((ArrayList<T>)input.clone());
        }

        if(!stepsRequired)
            steps.add((ArrayList<T>)input.clone());
        return steps;
    }

    public ArrayList<ArrayList<T>> bubbleSort(ArrayList<T> input, boolean stepsRequired){
        // Declaring Variables
        input = (ArrayList<T>)input.clone();
        ArrayList<ArrayList<T>> steps = new ArrayList<>();
        steps.add((ArrayList<T>)input.clone());
        boolean swapped = false;

        for(int i = 0 ; i < input.size() ; i++){
            swapped = false;
            for(int j = 0 ; j < input.size() - i - 1 ; j++){
                if(input.get(j).compareTo(input.get(j+1)) > 0){
                    swapped = true;
                    swap(input, j, j+1);
                    if(stepsRequired)
                        steps.add((ArrayList<T>)input.clone());
                }
            }
            if(!swapped)    // Optimization
                break;
        }

        if(!stepsRequired)
            steps.add((ArrayList<T>)input.clone());

        return steps;
    }

    public ArrayList<ArrayList<T>> insertionSort (ArrayList<T> list, boolean stepsRequired) {
        list = (ArrayList<T>)list.clone();
        ArrayList<ArrayList<T>> ordered_list = new ArrayList<>();
        ordered_list.add((ArrayList<T>) list.clone());
        // start from 1 as the leftmost is already sorted
        for(int i=1 ; i< list.size() ; i++) {
            int j = i;
            while((j > 0) && (list.get(j - 1).compareTo(list.get(j)) > 0)) {
                swap(list , j-1 ,  j);
                j--;
            }
            if(stepsRequired)
                ordered_list.add((ArrayList<T>) list.clone());
        }
        if(!stepsRequired)
            ordered_list.add((ArrayList<T>) list.clone());
        return ordered_list;
    }

    private void swap(ArrayList<T> list, int i, int j) {
        T temp = list.get(j);
        list.set(j , list.get(i));
        list.set(i , temp);
    }

}
