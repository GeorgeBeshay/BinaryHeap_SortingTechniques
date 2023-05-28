package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import Binary_Heap.*;

public class HeapSort_Factory <T extends Comparable<T>> extends SortFactory<T>{
    @Override
    public Function<ArrayList<T>, ArrayList<ArrayList<T>>> getSortingAlgorithm(String algorithmName) {
        if(algorithmName.equals("Heap Sort"))
            return this::heapSort;
        else
            return null;
    }

    public ArrayList<ArrayList<T>> heapSort(ArrayList<T> input){
        input = (ArrayList<T>)input.clone();
        Heap_IF<T> heap = new Min_Heap<>(input.toArray((T[])(new Comparable[input.size()])));
        ArrayList<ArrayList<T>> steps = new ArrayList<>();
        T[] output = (T[]) new Comparable[input.size()];
        for(int i = 0 ; i < input.size() ; i++){
            output[i] = heap.remove();
            steps.add(new ArrayList<>(Arrays.asList(output)));
        }
        return steps;
    }
}
