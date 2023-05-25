package Sorting_Algorithms;

import java.util.function.Function;
import java.util.*;

public abstract class SortFactory<T extends Comparable<T>> {
    public abstract Function<ArrayList<T>, ArrayList<ArrayList<T>>> getSortingAlgorithm(String algorithmName);
}
