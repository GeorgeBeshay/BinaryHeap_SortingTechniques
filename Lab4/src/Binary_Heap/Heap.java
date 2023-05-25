package Binary_Heap;

// Assigned to Mariam & George.

public abstract class Heap<T extends Comparable<T>> implements Heap_IF<T>{

    public abstract void restructure_insert(int index);
    public abstract void restructure_remove(int index);

    @Override
    public Heap_IF<T> insert(T element) {
        return null;
    }

    @Override
    public T remove() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public void display() {

    }

    public void heapSort(){}

}
