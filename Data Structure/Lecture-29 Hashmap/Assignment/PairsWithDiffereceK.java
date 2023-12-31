package Assignment;
import java.util.HashMap;

public class PairsWithDiffereceK {
    public static int getPairsWithDifferenceK(int arr[], int k) {

		// HashMap<Integer,Boolean> map = new HashMap<>();
        // int count = 0;
        
        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i],true);
        // }

        // for(int i=0; i<arr.length; i++){
        //     if (map.containsKey(arr[i]+k) && map.get(arr[i]+k)){
        //         count++;
        //     }
        //     if (map.containsKey(arr[i]-k) && map.get(arr[i]-k)){
        //         count++;
        //     }
        //     map.put(arr[i], false);
        // }
        // return count;


        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pairCount = 0;
		for(int i : arr){
			int p1 = i + k;
			boolean flag = false;
			if(i == p1) {
				flag = true;
			}
			if(map.containsKey(p1)){
				pairCount += map.get(p1);
			}
			int p2 = i - k;
			if(map.containsKey(p2) && !flag){
				pairCount += map.get(p2);
			}
			if(map.containsKey(i)){
				map.put(i, map.get(i) + 1);
			}else{
				map.put(i, 1);
			}
		}
		return pairCount;
	}
}