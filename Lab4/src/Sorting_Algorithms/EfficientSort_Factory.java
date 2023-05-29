package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.Random;

public class EfficientSort_Factory <T extends Comparable<T>> extends SortFactory<T>{

    /*
     * !!!!!!!!!!!!! IMPORTANT NOTES - READ ME !!!!!!!!!!!!
     * The following applies on all of the sorting algorithms.
     * Take the unsorted arrayList as an input, return a list of lists
     * each list represents a STEP in the algorithm
     * the last element represents the SORTED ARRAY LIST.
     */

    @Override
    public BiFunction<ArrayList<T>, Boolean, ArrayList<ArrayList<T>>> getSortingAlgorithm(String algorithmName) {
        switch (algorithmName){
            case "Merge Sort":
                return this::mergeSort;
            case "Quick Sort":
                return this::quickSort;
            default:
                break;
        }
        return null;
    }

    // Assigned to >> George Selim.
    public ArrayList<ArrayList<T>> mergeSort(ArrayList<T> input, boolean stepsRequired){
        input = (ArrayList<T>)input.clone();
        ArrayList<ArrayList<T>> result = new ArrayList<>();
        result.add(new ArrayList<>(input)); // Add the initial input list to the result
        ArrayList<T> finalAnswer = mergeSortHelper(input, result, stepsRequired);
        if(!stepsRequired)
            result.add(finalAnswer);
        return result;
    }

    private ArrayList<T> mergeSortHelper(ArrayList<T> input, ArrayList<ArrayList<T>> result, boolean stepsRequired) {
        if (input.size() <= 1) {
            result.add(input);
            return input;
        }

        int mid = input.size() / 2;
        ArrayList<T> left = new ArrayList<>(input.subList(0, mid));
        ArrayList<T> right = new ArrayList<>(input.subList(mid, input.size()));

        ArrayList<T> leftResult = mergeSortHelper(left, result, stepsRequired);
        ArrayList<T> rightResult = mergeSortHelper(right, result, stepsRequired);

        return merge(leftResult, rightResult, result, stepsRequired);
    }

    private ArrayList<T> merge(ArrayList<T> left, ArrayList<T> right, ArrayList<ArrayList<T>> result, boolean stepsRequired) {
        ArrayList<T> merged = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex).compareTo(right.get(rightIndex)) <= 0) {
                merged.add(left.get(leftIndex));
                leftIndex++;
            } else {
                merged.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex));
            rightIndex++;
        }
        if(stepsRequired)
            result.add(new ArrayList<>(merged)); // Add the merged list to the result
        return merged;
    }

    public ArrayList<ArrayList<T>> quickSort (ArrayList<T> list, boolean stepsRequired) {
        list = (ArrayList<T>)list.clone();
        ArrayList<ArrayList<T>> ordered_list = new ArrayList<>();
        ordered_list.add((ArrayList<T>) list.clone());
        if (list == null || list.size() == 0)
            return ordered_list;
        Q_Sort(list , 0 , list.size()-1 , ordered_list, stepsRequired);
        if(!stepsRequired)
            ordered_list.add((ArrayList<T>) list.clone());
        return ordered_list;
    }

    private void  Q_Sort(ArrayList<T> list , int low , int high , ArrayList<ArrayList<T>> ordered_list, boolean stepsRequired) {
        if(low < high) {
            int pivotIndex = partition(list , low , high , ordered_list, stepsRequired);
            Q_Sort(list , low , pivotIndex-1 , ordered_list, stepsRequired);
            Q_Sort(list , pivotIndex+1 , high , ordered_list, stepsRequired);
        }
    }

    private int partition(ArrayList<T> list , int low_index , int high_index , ArrayList<ArrayList<T>> ordered_list, boolean stepsRequired) {

        // choosing the pivot randomly then putting it in the high index
        Random random = new Random();
        int pivot_index = random.nextInt(high_index - low_index + 1) + low_index;
        T pivot = list.get(pivot_index);
        swap(list , pivot_index , high_index);

        int i = low_index-1;

        // check each element and swaps it before the pivot if its value is smaller.
        for (int j = low_index ; j < high_index; j++) {
            if (list.get(j).compareTo(pivot) <= 0) {
                i++;
                swap(list, i, j);
            }
        }

        // put the pivot in its correct place (item from left place)
        swap(list, i+1 , high_index);
        if(stepsRequired)
            ordered_list.add((ArrayList<T>) list.clone());
        return i+1;
    }

    private void swap(ArrayList<T> list, int i, int j) {
        T temp = list.get(j);
        list.set(j , list.get(i));
        list.set(i , temp);
    }

}
