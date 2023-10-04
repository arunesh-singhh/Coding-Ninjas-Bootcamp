// Old mathod which return the min value
// public class MinimumInArray {
//     public static int findMin(int[] arr, int sIndex){
//         if (sIndex == arr.length) {
//             return Integer.MAX_VALUE;
//         }
//         int smallArrayMin = findMin(arr, sIndex+1);
//         if (arr[sIndex] < smallArrayMin) {
//             return arr[sIndex];
//         }
//         else{
//             return smallArrayMin;
//         }
//     }

//     public static void main(String[] args) {
//         int a[] = {4, 5, 9, 2, 3, 7, 8};
//         int min = findMin(a, 0);
//         System.out.println(min);
//     }
// }


// new recursion function which is print the min value do not return anythng
public class MinimumInArray {
    public static void printMin(int[] a, int startIndex, int min){
        if (startIndex == a.length) {
            System.out.println(min);
            return;
        }
        if (a[startIndex] < min) {
            min = a[startIndex];
        }
        printMin(a, startIndex+1, min);

    }

    public static void main(String[] args) {
        int a[] = {4, 5, 9, 2, 3, 7, 8};
        printMin(a, 0, Integer.MAX_VALUE);
    }
}