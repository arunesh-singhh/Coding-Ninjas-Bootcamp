import java.util.ArrayList;

class PriorityQueueException extends Exception{

}


public class MinPriorityQueueFunction<T> {
    private ArrayList<PriorityQueueElement<T>> heap;
    
    public MinPriorityQueueFunction(){
        heap =new ArrayList<>();
    }

    public void insert(T value, int priority){
        PriorityQueueElement<T> element = new PriorityQueueElement<T>(value, priority);
        heap.add(element);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;

        while (childIndex>0) {
            if(heap.get(parentIndex).priority > heap.get(childIndex).priority){
                PriorityQueueElement<T> temp = heap.get(childIndex);
                heap.add(childIndex, heap.get(parentIndex));
                heap.add(parentIndex, temp);

                childIndex = parentIndex;
                parentIndex = (childIndex-1)/2;
            }
            else{
                return;
            }
        }
    }

    public T removeMin() throws PriorityQueueException{
        if (heap.isEmpty()) {
            throw new PriorityQueueException();
        }

        PriorityQueueElement<T> removed = heap.get(0);
        T ans = removed.value;

        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int parentIndex = 0;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;

        while (leftChildIndex < heap.size()) {
            int minIndex = parentIndex;
            if (heap.get(leftChildIndex).priority < heap.get(minIndex).priority) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && (heap.get(rightChildIndex).priority < heap.get(minIndex).priority)) {
                minIndex = rightChildIndex;
            }
            if (minIndex == parentIndex) {
                break;
            }

            PriorityQueueElement<T> temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);

            parentIndex = minIndex;
            leftChildIndex = 2*parentIndex+1;
            rightChildIndex = 2*parentIndex+2;
        }
        return ans;
    }

    public T getMin() throws PriorityQueueException{
        if (isEmpty()) {
            throw new PriorityQueueException();
        }
        return heap.get(0).value;
    }

    public int size(){
        return heap.size();
    }

    public boolean isEmpty(){
        if (size() == 0) {
            return true;
        }
        return false;
    }

}