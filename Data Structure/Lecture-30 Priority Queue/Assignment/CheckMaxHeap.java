package Assignment;

public class CheckMaxHeap {
    public static boolean checkMaxHeap(int arr[]) {

		int parentIndex = 0;
		int leftChildIndex = 2*parentIndex+1;
		int rightChildIndex = 2*parentIndex+2;

		while (leftChildIndex < arr.length) {
			if (arr[parentIndex] < arr[leftChildIndex]){
				return false;
			}
            if (rightChildIndex < arr.length && arr[parentIndex] < arr[rightChildIndex]) {
                return false;
            }
            parentIndex += 1;
		    leftChildIndex = 2*parentIndex+1;
		    rightChildIndex = 2*parentIndex+2;
		}
        return true;
	}
}



/*
Time complexity: O(N)
Space complexity: O(1)
where N is the size of the input array
*/

// public class Solution {
//     public static boolean checkMaxHeap(int arr[]) {
//         int n = arr.length;
//         for (int i = 0; 2 * i + 1 < n; i++) {
//             int leftChildIndex = 2 * i + 1;
//             int rightChildIndex = leftChildIndex + 1;
//             // if left child greater than parent then return false
//             if (arr[i] < arr[leftChildIndex]) {
//                 return false;
//             }
//             // if right child exists and is greater than parent then return false
//             if (rightChildIndex<n && arr[i] < arr[rightChildIndex]) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }