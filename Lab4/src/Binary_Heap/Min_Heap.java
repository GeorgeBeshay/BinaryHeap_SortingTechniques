package Binary_Heap;

public class Min_Heap<T extends Comparable<T>> extends Heap<T>{

    public Min_Heap(int initCap){
        super(initCap);
    }

    public Min_Heap(){
        super();
    }

    public Min_Heap(T[] arr){
        super(arr);
    }

    @Override
    public void restructure_insert(int index) {
        int parentIndex;
        T temp;
        while(index > 0) {
            parentIndex = (index - 1) / 2;
            if(heap[parentIndex].compareTo(heap[index]) > 0) {
                temp = heap[parentIndex];
                heap[parentIndex] = heap[index];
                heap[index] = temp;
                index = parentIndex;
            }
            else
                break;
        }
    }

    @Override
    public void restructure_remove(int index)
    {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallestIndex;
        T temp;
        while(leftChildIndex < currentIndex || rightChildIndex < currentIndex) {
            if(rightChildIndex < currentIndex) {
                if (heap[rightChildIndex].compareTo(heap[leftChildIndex]) < 0)
                    smallestIndex = rightChildIndex;
                else
                    smallestIndex = leftChildIndex;
            } else
                smallestIndex = leftChildIndex;
            if(heap[index].compareTo(heap[smallestIndex]) > 0) {
                temp = heap[smallestIndex];
                heap[smallestIndex] = heap[index];
                heap[index] = temp;
                index = smallestIndex;
                leftChildIndex = 2 * index + 1;
                rightChildIndex = 2 * index + 2;
            } else
                break;
        }
    }

    @Override
    public boolean validate_heap(){
        int leftChildIndex, rightChildIndex;
        for(int i = 0 ; i < heap.length ; i++) {
            leftChildIndex = 2 * i + 1;
            rightChildIndex = 2 * i + 2;
            if(leftChildIndex >= heap.length)
                break;
            if(heap[i].compareTo(heap[leftChildIndex]) > 0)
                return false;
            if(rightChildIndex < heap.length)
                if(heap[i].compareTo(heap[rightChildIndex]) > 0)
                    return false;
        }
        return true;
    }

}
