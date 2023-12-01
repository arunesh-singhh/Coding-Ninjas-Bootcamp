import java.util.HashMap;

// public class Solution{
//     public static int findUnique(int[] arr){
//         for(int i = 0; i < arr.length; i++) {
//             int j;
//             for(j = 0; j < arr.length; j++) {
//                 if(i != j && arr[i] == arr[j]) {
//                     break;
//                 }
//             }
//             if(j == arr.length) {
//                 return arr[i];
//             }
//         }
//         return Integer.MAX_VALUE;
//     }
// }


// using hashmap
public class FindUnique {
    public static int findUnique(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return-1;
    }
}
