public class LargestElementOfArray {
    
    public static int largestElement(int[] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
