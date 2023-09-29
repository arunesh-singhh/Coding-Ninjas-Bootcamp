package Assignment;
import java.util.ArrayList;

public class RemoveMin {
	private ArrayList<Integer> heap;
	public RemoveMin() {
		heap = new ArrayList<Integer>();
	}
    
    // check is empty
	boolean isEmpty() {
		return heap.size() == 0;
	}
    // return size
	int size() {
		return heap.size();
	}

	public int removeMin() throws PriorityQueueException{
		if(isEmpty()){
			throw new PriorityQueueException();
		}
		int ans = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int parentindex = 0;
		int minIndex = parentindex;
		int leftChildIndex = 1;
		int rightChildIndex = 2;

		while(leftChildIndex < heap.size()){
			if(heap.get(leftChildIndex) < heap.get(minIndex)){
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)){
				minIndex = rightChildIndex;
			}
			if(minIndex == parentindex){
				break;
			}
			int temp1 = heap.get(parentindex);
			heap.set(parentindex, heap.get(minIndex));
			heap.set(minIndex, temp1);

			parentindex = minIndex;
			leftChildIndex = 2 * parentindex + 1;
			rightChildIndex = 2 * parentindex + 2;
	
		}
		return ans;
	}
}

class PriorityQueueException extends Exception {

}