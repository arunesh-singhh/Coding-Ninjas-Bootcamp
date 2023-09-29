import java.util.PriorityQueue;

public class InbuiltPQ {
    public static void main(String[] args) {
        int arr[] = {4, 3, 7, 6, 9, 10, 1, 2};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }

        System.out.println(pq.peek());      // return top element
        System.out.println(pq.element());   // return top element
        System.out.println(pq.poll());      // remove top element
        System.out.println(pq.remove());    // remove top element
        System.out.println(pq.isEmpty());

        // while (!pq.isEmpty()) {
        //     System.out.println(pq.peek());
        //     pq.poll();
        // }
    }
}
