package Binary_Heap;

public interface Heap_IF<T extends Comparable<T>> {

    Heap_IF<T> insert(T element);     // inserts an element and fix the ree
    T remove();                    // remove the most _ element and return it
    T peek();                   // return the most _ element without removing it
    void buildHeap();
    void display();
    boolean validate_heap();

}
