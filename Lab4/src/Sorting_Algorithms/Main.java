package Sorting_Algorithms;

import java.util.ArrayList;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        SortFactory<Integer> sf = new SimpleSort_Factory<>();
        Function<ArrayList<Integer>, ArrayList<ArrayList<Integer>>> myF =
                sf.getSortingAlgorithm("Selection Sort");
        myF.apply(null);
    }
}
