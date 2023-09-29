package Assignment;

// import java.util.HashMap;

// public class PairSumTo0 {
//     public static int PairSum(int[] input, int size) {
//         if(size==0)
//             return 0;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         int count = 0;

//         for(int i=0; i<size; i++){   
//             if(map.containsKey(-input[i]) && map.get(-input[i])!=0){
//                 count += map.get(-input[i]);
//                 if(map.containsKey(input[i]))
//                     map.put(input[i],map.get(input[i])+1);
//                 else
//                     map.put(input[i],1);
//             }
//             else{
//                 if(map.containsKey(input[i])){
//                     map.put(input[i],map.get(input[i])+1);
//                 }else{
//                     map.put(input[i] ,1);
//                 }
//             }
//         }
//         return count;
//     }
// }


/*
Time Complexity: O(n)
Space Complexity: O(n)
where n is the size of input array
*/
import java.util.*;

public class PairSumTo0{
    public static int PairSum(int[] input, int size){

        HashMap<Integer,Integer> map = new HashMap<>();
        int finalCount=0;
        for(int i=0; i<size; i++){
            int key = input[i];
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1); //incrementing frequency value by 1 if key is already present in hashmap
            }
            else{
                map.put(key, 1); //initializing frequency value to 1 if key is not already present in hashmap
            }
        }
        //traversing the array and checking if -key is present in hashmap
        for(int i=0; i < size; i++){
            int key = input[i];
            if(map.containsKey(-key) && map.get(key)!=0){
                int times;
                if (key == (-key)){ //True in case of zero
                    int occurences = map.get(key);
                    times = (occurences * (occurences - 1)) / 2;
                    finalCount = finalCount+times;
                    map.put(key, 0);
                    continue;
                }
                times = map.get(key) * map.get(-key);
                finalCount = finalCount+times;
                map.put(key, 0);
                map.put(-key, 0);
            }
        }
        return finalCount;
    }
}