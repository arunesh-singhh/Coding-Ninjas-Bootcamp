package Assignment;
import java.util.ArrayList;

public class MaxPriorityQueue {
	private ArrayList<Integer> heap;
	public MaxPriorityQueue() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int getSize() {
		return heap.size();
	}

	int getMax() {
		if (isEmpty()) {
			//throw new PriorityQueueException();
			return Integer.MAX_VALUE;
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) > heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} 
            else {
				return;
			}
		}
    }

	int removeMax() {
		// if(isEmpty()){
		// 	throw new PriorityQueueException();
		// }
		int ans = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int parentindex = 0;
		int maxIndex = parentindex;
		int leftChildIndex = 1;
		int rightChildIndex = 2;

		while(leftChildIndex < heap.size()){

			if(heap.get(leftChildIndex) > heap.get(maxIndex)){
				maxIndex = leftChildIndex;
			}
			if(rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)){
				maxIndex = rightChildIndex;
			}
			if(maxIndex == parentindex){
				break;
			}

			int temp = heap.get(parentindex);
			heap.set(parentindex, heap.get(maxIndex));
			heap.set(maxIndex, temp);

			parentindex = maxIndex;
			leftChildIndex = 2 * parentindex + 1;
			rightChildIndex = 2 * parentindex + 2;
	
		}
		return ans;
	}
}

// class PriorityQueueException extends Exception{

// }