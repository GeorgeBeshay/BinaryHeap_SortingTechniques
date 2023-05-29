package Sorting_Algorithms;

import java.util.*;
import java.util.function.*;

public abstract class SortFactory<T extends Comparable<T>> {
    public abstract BiFunction<ArrayList<T>, Boolean, ArrayList<ArrayList<T>>> getSortingAlgorithm(String algorithmName);
}
