package Binary_Heap;

// Assigned to Mariam & George.

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Heap<T extends Comparable<T>> implements Heap_IF<T>{

    // class fields
    protected T[] heap;
    protected int currentIndex;

    // Abstract Methods to be implemented - Heapify methods
    public abstract void restructure_insert(int index);
    public abstract void restructure_remove(int index);
    public abstract boolean validate_heap();

    // Constructors
    public Heap(){
        this.heap = (T[]) new Comparable[100];
        this.currentIndex = 0;
    }

    public Heap(int initCap){
        this.heap = (T[]) new Comparable[initCap];
        this.currentIndex = 0;
    }

    public Heap(T[] unsortedArray){
        this.heap = Arrays.copyOf(unsortedArray, unsortedArray.length);
        this.currentIndex = this.heap.length;
        this.buildHeap();
    }

    @Override
    public Heap_IF<T> insert(T element) {
        heap[currentIndex] = element;
        restructure_insert(currentIndex);
        currentIndex++;
        if(isFull())
            resizeHeap(2 * heap.length);
        return this;
    }

    @Override
    public T remove() {
        T element = heap[0];
        heap[0] = heap[currentIndex-1];
        heap[currentIndex-1] = null; // not necessary
        currentIndex--;
        restructure_remove(0);
        return element;
    }

    @Override
    public T peek() {
        if(!isEmpty())
            return heap[0];
        System.out.println("Heap is empty, no elements to have a peek at.");
        return null;
    }

    @Override
    public void display() {
        if(!isEmpty()) {
            System.out.print("[");
            for (int i = 0; i < currentIndex; i++)
                System.out.print(heap[i] + ", ");
            System.out.println("]");
        } else
            System.out.println("Heap is empty, no elements to display.");
    }

    @Override
    public void buildHeap(){
        int indexToStartFrom = (int)(Math.pow(2, Math.floor(Math.log(this.heap.length) / Math.log(2))) - 2);
        for(int i = indexToStartFrom ; i >= 0 ; i--)
            this.restructure_remove(i);
    }

    public void resizeHeap(int newCapacity){
        int oldCapacity = heap.length;
        System.arraycopy(heap, 0, heap = ((T[]) new Comparable[newCapacity]), 0, oldCapacity);
    }

    public boolean isEmpty(){
        return currentIndex == 0;
    }

    public boolean isFull(){
        return currentIndex == heap.length;
    }

}
