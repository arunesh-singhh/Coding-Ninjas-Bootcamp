public class SwapAlternate {
    // public static void swapAlternate(int arr[]) {
    //     int n = arr.length;
    //     int i = 0;
        
    //     while (i+1 < n) {
    //         int temp = arr[i];
    //         arr[i] = arr[i + 1];
    //         arr[i + 1] = temp;
    //         i += 2;
    //     }
    // }

    // another way
    public static void swapAlternate(int arr[]) {
        for(int i = 0; i < (arr.length - 1); i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
