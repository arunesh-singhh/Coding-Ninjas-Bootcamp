
public class InplaceHeapShort {

    public static void downhpify(int arr[], int i, int n){
        int parentIndex = i;
        int leftChildIndex = 2*parentIndex+1;
        int rightChildIndex = 2*parentIndex+2;

        while (leftChildIndex < n) {
            int minIndex = parentIndex;
            if (arr[leftChildIndex] < arr[minIndex]) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < n && (arr[rightChildIndex] < arr[minIndex])) {
                minIndex = rightChildIndex;
            }
            if (minIndex == parentIndex) {
                break;
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[parentIndex];
            arr[parentIndex] = temp;

            parentIndex = minIndex;
            leftChildIndex = 2*parentIndex+1;
            rightChildIndex = 2*parentIndex+2;
        }
    }
    public static void heapShort(int arr[]){
        // build the heap
        int n = arr.length;
        for (int i = (n/2)-1; i >= 0; i--) {
            downhpify(arr, i, n);
        }
        // remove element one by one from starting and put them at respective last position
        for (int i = n-1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            downhpify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int [] arr = {4, 7, 3, 2, 8, 9, 6, 1};
        heapShort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
}