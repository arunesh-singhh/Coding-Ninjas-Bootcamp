import java.util.HashMap;

public class CheckSubset {
    
    public static boolean CheckSubset(int[] arr1, int n1, int[] arr2, int n2) {

		HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i =0;i<n1;i++){
            if (hashMap.containsKey(arr1[i])) 
                hashMap.put(arr1[i],hashMap.get(arr1[i])+1);
            else 
                hashMap.put(arr1[i],1);
        }
        for (int i =0;i<n2;i++){
            if (!hashMap.containsKey(arr2[i]) || hashMap.get(arr2[i])==0) 
                return false;
            hashMap.put(arr2[i],hashMap.get(arr2[i])-1);
        }
        return true;
	}	
}