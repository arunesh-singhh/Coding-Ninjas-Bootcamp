package Assignment;

public class ArrangeNumbersInArray {
    public static void arrange(int[] arr, int n) {
        int left = 0;
        int right = n - 1;
        int counter = 1;

        while(left <= right) {
            if(counter % 2 == 1) {
                arr[left] = counter;
                counter += 1;
                left += 1;
            } 
            else {
                arr[right] = counter;
                counter += 1;
                right -= 1;
            }
        }
    }

    // another way
    public static void arrang(int[] arr, int n) {
        int val = 1;
        for (int i = 0; val <= n; i++) {
            arr[i] = val;
            val += 2;
        }
        if (n%2==0) {
            val = n;
        }
        else {
            val = n-1;
        }
        for (int i = (n+1)/2; i < n; i++) {
            arr[i] = val;
            val -= 2;
        }
    }
}
