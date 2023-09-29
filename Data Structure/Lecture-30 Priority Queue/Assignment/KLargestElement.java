package Assignment;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class KLargestElement {
    
    public static ArrayList<Integer> kLargest(int input[], int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(input[i]);
        }

        for (int i = k; i < input.length; i++) {
            if (pq.peek() < input[i]) {
                pq.poll();
                pq.add(input[i]);
            }
        }
        while (!pq.isEmpty()) {
           arr.add(pq.poll());
        }
        return arr;
	}
}
