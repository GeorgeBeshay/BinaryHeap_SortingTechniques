package Sorting_Algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Sort_Array<T extends Comparable<T>> {

    private ArrayList<T> data;
    private Scanner scanner;

    public ArrayList<T> getData(){
        return data;
    }

    private ArrayList<T> importData(String fileName) {
        fileName = System.getProperty("user.dir").concat("/src/Scripts_and_RandomData/").concat(fileName);
        ArrayList<Integer> input = new ArrayList<>();
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file);
            String line = sc.nextLine();
            Arrays.stream(line.split(", ")).mapToInt(Integer::parseInt).forEach(input::add);
        } catch (FileNotFoundException e) {
            System.out.println("File doesn't exist.");
            return null;
        }
        return (ArrayList<T>) input;
    }

    /*
     * Takes an input file structured containing the list of elements comma separated, reads it,
     *  and initializes the array.
     */
    public Sort_Array(String fileName){
        this.data = importData(fileName);
        this.scanner = new Scanner(System.in);
    }

    /*
     * Takes 1 parameter which is whether to turn the intermediate arrays or
     * return the final sorted array. Then applies the sorting algorithm you chose to implement from
     * the O(n2) sorting algorithms and either return the intermediate results or the final result.
     */
    public ArrayList<ArrayList<T>> simpleSort(boolean finalOnly){
        int tempChoice = -1;
        while(tempChoice < 1 || tempChoice > 3) {
            System.out.println("Enter the algorithm number:");
            System.out.println("1. Simple Sort - Insertion Sort");
            System.out.println("2. Simple Sort - Bubble Sort");
            System.out.println("3. Simple Sort - Selection Sort");
            tempChoice = scanner.nextInt();
        }
        switch (tempChoice){
            case 1 -> {
                return ((new SimpleSort_Factory<T>()).getSortingAlgorithm("Insertion Sort"))
                        .apply(data, finalOnly);
            }
            case 2 -> {
                return ((new SimpleSort_Factory<T>()).getSortingAlgorithm("Bubble Sort"))
                        .apply(data, finalOnly);
            }
            case 3 -> {
                return ((new SimpleSort_Factory<T>()).getSortingAlgorithm("Selection Sort"))
                        .apply(data, finalOnly);
            }
            default -> {
            }
        }
        return null;
    }

    /*
     * Takes 1 parameter which is whether to turn the intermediate arrays or
     * return the final sorted array. Then applies the sorting algorithm you chose to implement from
     * the O(n lg n) sorting algorithms and either return the intermediate results or the final result.
     */
    public ArrayList<ArrayList<T>> efficientSort(boolean finalOnly){
        int tempChoice = -1;
        while(tempChoice < 1 || tempChoice > 2) {
            System.out.println("Enter the algorithm number:");
            System.out.println("1. Efficient Sort - Merge Sort");
            System.out.println("2. Efficient Sort - Quick Sort");
            tempChoice = scanner.nextInt();
        }
        switch (tempChoice){
            case 1 -> {
                return ((new EfficientSort_Factory<T>()).getSortingAlgorithm("Merge Sort"))
                        .apply(data, finalOnly);
            }
            case 2 -> {
                return ((new EfficientSort_Factory<T>()).getSortingAlgorithm("Quick Sort"))
                        .apply(data, finalOnly);
            }
            default -> {
            }
        }
        return null;
    }

    /*
     * Takes 1 parameter which is whether to turn the intermediate arrays or
     * return the final sorted array. Then applies the sorting algorithm you chose to implement from
     * the O(n) sorting algorithms and either return the intermediate results or the final result.
     */
    public ArrayList<ArrayList<T>> nonComparisonSort(boolean finalOnly){
        int tempChoice = -1;
        while(tempChoice < 1 || tempChoice > 2) {
            System.out.println("Enter the algorithm number:");
            System.out.println("1. Non Comparison Sort - Counting Sort");
            System.out.println("2. Non Comparison Sort - Radix Sort");
            tempChoice = scanner.nextInt();
        }
        switch (tempChoice){
            case 1 -> {
                return ((new NonComparisonSort_Factory<T>()).getSortingAlgorithm("Counting Sort"))
                        .apply(data, finalOnly);
            }
            case 2 -> {
                return ((new NonComparisonSort_Factory<T>()).getSortingAlgorithm("Radix Sort"))
                        .apply(data, finalOnly);
            }
            default -> {
            }
        }
        return null;
    }

    /*
     * Takes 1 parameter which is whether to turn the intermediate arrays or
     * return the final sorted array. Then applies the heap sorting algorithm on the variable "data"
     * and either return the intermediate results or the final result
     */
    public ArrayList<ArrayList<T>> heapSort(boolean finalOnly){
        return ((new HeapSort_Factory<T>()).getSortingAlgorithm("Heap Sort"))
                .apply(data, finalOnly);
    }

}
