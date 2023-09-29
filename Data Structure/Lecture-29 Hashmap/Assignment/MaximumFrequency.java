package Assignment;
import java.util.HashMap;

public class MaximumFrequency {

    public static int maxFrequencyNumber(int[] arr){ 

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
                map.put(arr[i],1);
        }
        int max=0;
        int maxKey=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>max){
                max=map.get(arr[i]);
                maxKey=arr[i];
			}
        }
        return maxKey ;
    }
}
