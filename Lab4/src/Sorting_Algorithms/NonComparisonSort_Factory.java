package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.function.BiFunction;
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
    public BiFunction<ArrayList<T>, Boolean, ArrayList<ArrayList<T>>> getSortingAlgorithm(String algorithmName) {
        switch (algorithmName){
            case "Counting Sort":
                return this::countingSort;
            case "Radix Sort":
                return this::radixSort; // TODO: Change the returned function.
            default:
                break;
        }
        return null;
    }

    // Assigned To Mariam & George

    public ArrayList<ArrayList<T>> countingSort(ArrayList<T> in, boolean stepsRequired){
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
            if(stepsRequired)
                steps.add(new ArrayList<>(Arrays.asList(output)));
        }
        if(!stepsRequired)
            steps.add(new ArrayList<>(Arrays.asList(output)));
        return steps;
    }

    public ArrayList<ArrayList<T>> radixSort(ArrayList<T> in, boolean stepsRequired){
        ArrayList<ArrayList<T>> ordered_list = new ArrayList<>();
        ArrayList<Integer> list = (ArrayList<Integer>) in;
        if (list == null || list.size() == 0) {
            return ordered_list;
        }
        if(stepsRequired)
            ordered_list.add((ArrayList<T>) list.clone());

        // Separate positive and negative values
        ArrayList<Integer> positiveValues = new ArrayList<>();
        ArrayList<Integer> negativeValues = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if ((int)num >= 0) {
                positiveValues.add(num);
            } else {
                negativeValues.add(Math.abs(num));
            }
        }

        // Sort positive values using radix sort
        if (!positiveValues.isEmpty()) {
            int maxPositive = getMax(positiveValues);
            int exp = 1;
            while (maxPositive / exp > 0) {
                countingSort(positiveValues, exp);
                if(stepsRequired)
                    ordered_list.add((ArrayList<T>) positiveValues.clone());
                exp *= 10;
            }
        }

        // Sort absolute values of negative numbers using radix sort
        if (!negativeValues.isEmpty()) {
            int maxNegative = getMax(negativeValues);
            int exp = 1;
            while (maxNegative / exp > 0) {
                countingSort(negativeValues, exp);
                if(stepsRequired)
                    ordered_list.add((ArrayList<T>) positiveValues.clone());
                exp *= 10;
            }
        }
        // Combine the sorted positive and negative values
        list.clear();
        for (int i = negativeValues.size() - 1; i >= 0; i--) {
            list.add(-negativeValues.get(i));
        }
        for (int i =  0; i < positiveValues.size(); i++) {
            list.add(positiveValues.get(i));
        }
        if(!negativeValues.isEmpty() && !positiveValues.isEmpty() && stepsRequired) {
            ordered_list.add((ArrayList<T>) list.clone());
        }
        else if(!stepsRequired) {
            ordered_list.add((ArrayList<T>) list.clone());
        }
            return  ordered_list;
        }

        private int getMax(ArrayList<Integer> list) {
            int max = list.get(0);
            for(int i=1 ; i<list.size() ; i++) {
                if(list.get(i) > max) {
                    max = list.get(i);
                }
            }
            return max;
        }

        private void countingSort(ArrayList<Integer> list , int exp) {
            int n = list.size();
            ArrayList<Integer> output = new ArrayList<>(Collections.nCopies(n , 0));
            ArrayList<Integer> count = new ArrayList<>(Collections.nCopies(10 , 0));
            // Store the count of occurrences in count
            for(int i=0 ; i<n ; i++) {
                int digit = (list.get(i) / exp) % 10;
                count.set(digit , count.get(digit) + 1);
            }

            // increment the places
            for(int i=1 ; i<10 ; i++) {
                count.set(i , count.get(i) + count.get(i-1));
            }

            // Build the output list
            for(int i = n-1 ; i>=0 ; i--) {
                int digit = (list.get(i) / exp) % 10;
                output.set(count.get(digit) - 1 , list.get(i));
                count.set(digit , count.get(digit)-1);
            }
            // copy the output to the list
            for(int i=0 ; i<n ; i++) {
                list.set(i , output.get(i));
            }
        }
}

