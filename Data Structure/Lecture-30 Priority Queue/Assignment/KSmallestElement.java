package Assignment;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class KSmallestElement {
    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		ArrayList<Integer> arr = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n-k; i++) {
            pq.add(input[i]);
        }

        for (int i = n-k; i < input.length; i++) {
            if (pq.peek() < input[i]) {
                int temp = pq.poll();
                pq.add(input[i]);
                input[i] = temp;
            }
        }
        for (int i = n-1; i < input.length; i++) {
            arr.add(input[i]);
        }
        return arr;
	}
}


// using max heap

/*
Time complexity: O(N * log(K))
Space complexity: O(K)
where N is the size of the input array
and K is the number of smallest elements that are to be found
*/

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.PriorityQueue;

// public class Solution {
//     public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
//         //Making a max PQ
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for (int i = 0; i < k; i++) {
//             pq.add(input[i]);
//         }
//         for (int i = k; i < n; i++) {
//             if (input[i] < pq.peek()) {
//                 pq.poll();
//                 pq.add(input[i]);
//             }
//         }
//         ArrayList<Integer> output = new ArrayList<>();
//         while (!pq.isEmpty()) {
//             output.add(pq.poll());
//         }
//         return output;
//     }
// }