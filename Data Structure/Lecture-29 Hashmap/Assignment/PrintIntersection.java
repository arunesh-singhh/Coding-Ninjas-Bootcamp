package Assignment;

import java.util.Arrays;
import java.util.HashMap;

public class PrintIntersection {
    public static void intersection(int[] arr1, int[] arr2) {
	     if(arr1.length==0 || arr2.length==0)
            return ;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){   
			if(map.containsKey(arr1[i])){
                map.put(arr1[i], map.get(arr1[i])+1);
			}
            else{
				map.put(arr1[i],1);
			}
        }
        
	    Arrays.sort(arr2);
        for(int i=0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                if(map.get(arr2[i])!=0){
                    System.out.print(arr2[i] + " ");
                    map.put(arr2[i],map.get(arr2[i])-1);
                }
            }
        }
    }
}


// import java.util.Arrays;

// public class PrintIntersection {
//     public static void intersection(int[] arr1, int[] arr2) {
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         int n = arr1.length, m = arr2.length;
//         int i = 0, j = 0; //pointer to iterate over arr1 and arr2

//         while(i < n && j < m) {
//             if(arr1[i] == arr2[j]) {
//                 System.out.print(arr1[i] + " ");
//                 i += 1;
//                 j += 1;
//             }
//             else if(arr1[i] < arr2[j]) {
//                 i += 1;
//             } 
//             else {
//                 j += 1;
//             }
//         }
//     }
// }
