package Sorting_Algorithms;

import java.util.ArrayList;
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
    public Function<ArrayList<T>, ArrayList<ArrayList<T>>> getSortingAlgorithm(String algorithmName) {
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
    public ArrayList<ArrayList<T>> mergeSort(ArrayList<T> input){
        input = (ArrayList<T>)input.clone();
        ArrayList<ArrayList<T>> result = new ArrayList<>();
        result.add(new ArrayList<>(input)); // Add the initial input list to the result
        mergeSortHelper(input, result);
        return result;
    }

    private ArrayList<T> mergeSortHelper(ArrayList<T> input, ArrayList<ArrayList<T>> result) {
        if (input.size() <= 1) {
            result.add(input);
            return input;
        }

        int mid = input.size() / 2;
        ArrayList<T> left = new ArrayList<>(input.subList(0, mid));
        ArrayList<T> right = new ArrayList<>(input.subList(mid, input.size()));

        ArrayList<T> leftResult = mergeSortHelper(left, result);
        ArrayList<T> rightResult = mergeSortHelper(right, result);

        return merge(leftResult, rightResult, result);
    }

    private ArrayList<T> merge(ArrayList<T> left, ArrayList<T> right, ArrayList<ArrayList<T>> result) {
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

        result.add(new ArrayList<>(merged)); // Add the merged list to the result
        return merged;
    }

    public ArrayList<ArrayList<T>> quickSort (ArrayList<T> list) {
        list = (ArrayList<T>)list.clone();
        ArrayList<ArrayList<T>> ordered_list = new ArrayList<>();
        if (list == null || list.size() == 0)
            return ordered_list;
        Q_Sort(list , 0 , list.size()-1, ordered_list);
        return ordered_list;
    }

    private void  Q_Sort(ArrayList<T> list , int low_index , int high_index,
                         ArrayList<ArrayList<T>> ordered_list) {

        if (low_index >= high_index) {
            return;
        }
        ordered_list.add((ArrayList<T>) list.clone());

        Random random = new Random();
        int pivot_index = random.nextInt(high_index - low_index + 1) + low_index;
        T pivot = list.get(pivot_index);
        swap(list , pivot_index , high_index);


        int left_pointer = partition(list , low_index , high_index , pivot);
        Q_Sort(list , low_index , left_pointer-1, ordered_list);
        Q_Sort(list , left_pointer+1 , high_index, ordered_list);
    }

    private  int partition(ArrayList<T> list , int low_index , int high_index , T pivot) {
        int left_pointer = low_index;
        int right_pointer = high_index-1;

        while(left_pointer < right_pointer) {
            // move from left till reaching a value > pivot , or hit the right_pointer
            while(list.get(left_pointer).compareTo(pivot) <= 0 && left_pointer < right_pointer) {
                left_pointer++;
            }

            // move from right till reaching a value < pivot , or hit the left_pointer
            while(list.get(right_pointer).compareTo(pivot) >= 0 && left_pointer < right_pointer) {
                right_pointer--;
            }

            // once found
            swap(list , left_pointer , right_pointer);
        }
        // check before swapping and putting the pivot in its right place
        if(list.get(left_pointer).compareTo(list.get(high_index)) > 0) {
            swap(list , left_pointer , high_index);
        }
        else {
            left_pointer = high_index;
        }
        return  left_pointer;
    }

    private void swap(ArrayList<T> list, int i, int j) {
        T temp = list.get(j);
        list.set(j , list.get(i));
        list.set(i , temp);
    }

}
