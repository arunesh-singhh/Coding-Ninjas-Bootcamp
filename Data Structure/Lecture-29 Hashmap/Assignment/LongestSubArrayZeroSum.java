package Assignment;

import java.util.HashMap;

public class LongestSubArrayZeroSum {
    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
	    if(arr.length ==0){
			return 0;
		}
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlength=0;
        int maxlength1=0;

        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                int k=map.get(sum);
                int l=i-k;
                maxlength1=l;
			}
            else{
                map.put(sum,i);
			}
            if(sum==0){
                maxlength1=i+1;
            }
            if(maxlength1>maxlength){
                maxlength=maxlength1;
			}
        }
        return maxlength;
    }
}