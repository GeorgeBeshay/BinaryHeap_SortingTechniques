package Analysis;

import Sorting_Algorithms.*;
import java.util.ArrayList;
import java.util.Random;

public class Analysis {

    private static final Random random = new Random();

    public static ArrayList<Integer> getLastList(ArrayList<ArrayList<Integer>> steps){
        return steps.get(steps.size() - 1);
    }

    public static ArrayList<Integer> generateRandomList(int size) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < size; i++)
            temp.add(random.nextInt(1000000) - 500000);
        return temp;
    }

    public static void main(String[] args) {
        // Declaring Variables
//        int[] sizes = {10, 100, 500, 1000, 1500, 2000, 5000,
//                10000, 20000, 40000, 50000, 70000, 90000,
//                100000, }; // in case of running the simple sort algorithms, use this version.
        int[] sizes = {10, 100, 500, 1000, 1500, 2000, 5000,
                10000, 20000, 40000, 50000, 70000, 90000,
                100000, 200000, 400000, 500000, 750000, 900000, 1000000,
                2000000, 2250000, 2400000, 2600000, 2800000, 3000000};
        SortFactory<Integer> simpleSortFactory = new SimpleSort_Factory<>();
        SortFactory<Integer> efficientSortFactory = new EfficientSort_Factory<>();
        SortFactory<Integer> heapSortFactory = new HeapSort_Factory<>();
        SortFactory<Integer> nonComparisonSortFactory = new NonComparisonSort_Factory<>();
        ArrayList<ArrayList<Long>> observations = new ArrayList<>();
        ArrayList<Integer> experimentList;
        long t1, t2;

        for(int size : sizes){
            experimentList = generateRandomList(size);
            ArrayList<Long> tempObservation = new ArrayList<>();

            t1 = System.nanoTime();
//            (simpleSortFactory.getSortingAlgorithm("Insertion Sort")).apply(experimentList, false);
            t2 = System.nanoTime();
            tempObservation.add(t2 - t1);

            t1 = System.nanoTime();
//            (simpleSortFactory.getSortingAlgorithm("Bubble Sort")).apply(experimentList, false);
            t2 = System.nanoTime();
            tempObservation.add(t2 - t1);

            t1 = System.nanoTime();
//            (simpleSortFactory.getSortingAlgorithm("Selection Sort")).apply(experimentList, false);
            t2 = System.nanoTime();
            tempObservation.add(t2 - t1);

            t1 = System.nanoTime();
            (efficientSortFactory.getSortingAlgorithm("Merge Sort")).apply(experimentList, false);
            t2 = System.nanoTime();
            tempObservation.add(t2 - t1);

            t1 = System.nanoTime();
            (efficientSortFactory.getSortingAlgorithm("Quick Sort")).apply(experimentList, false);
            t2 = System.nanoTime();
            tempObservation.add(t2 - t1);

            t1 = System.nanoTime();
            (nonComparisonSortFactory.getSortingAlgorithm("Counting Sort")).apply(experimentList, false);
            t2 = System.nanoTime();
            tempObservation.add(t2 - t1);

            t1 = System.nanoTime();
//            (nonComparisonSortFactory.getSortingAlgorithm("Radix Sort")).apply(experimentList, false);
            t2 = System.nanoTime();
            tempObservation.add(t2 - t1);

            t1 = System.nanoTime();
            (heapSortFactory.getSortingAlgorithm("Heap Sort")).apply(experimentList, false);
            t2 = System.nanoTime();
            tempObservation.add(t2 - t1);

            observations.add(tempObservation);
        }

        for(int i = 0 ; i < observations.size() ; i++){
            ArrayList<Long> observation = observations.get(i);
            System.out.print(sizes[i] + "\t");
            for(Long num : observation)
                System.out.print(num + "\t");
            System.out.println();
        }
    }

}
