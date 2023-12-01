package Assignment;

import java.util.Arrays;

public class WaysToMakeCoinChange {

    // using memorization
    static long countWaysToMakeChangeUtil(int[] arr, int ind, int T, long[][] dp) {
        if (ind == 0) {
            if (T % arr[0] == 0)
                return 1;
            else
                return 0;
        }

        if (dp[ind][T] != -1)
            return dp[ind][T];

        long notTaken = countWaysToMakeChangeUtil(arr, ind - 1, T, dp);
        long taken = 0;
        if (arr[ind] <= T)
            taken = countWaysToMakeChangeUtil(arr, ind, T - arr[ind], dp);

        return dp[ind][T] = notTaken + taken;
    }

    static long countWaysToMakeChange(int[] arr, int n, int T) {
        long dp[][] = new long[n][T + 1];
        for (long row[] : dp)
            Arrays.fill(row, -1);

        return countWaysToMakeChangeUtil(arr, n - 1, T, dp);
    }
    
    // using itrative DP
    public static int countWaysToMakeChange(int denominations[], int value){
        int m = value;
        int n = denominations.length;

        int[][] dp = new int[n+1][m+1];
        for(int i=0; i <= n; i++){
            dp[i][0] = 1;
        }
        for(int i=0; i <= m; i++){
            dp[0][i] = 0;
        }

        for(int i=1; i <= n; i++){
            for(int j=1; j <=m; j++){
                if(j >= denominations[i-1]){
                    dp[i][j] = (dp[i-1][j])+(dp[i][j-denominations[i-1]]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int changeFor = 4;
        int ans = countWaysToMakeChange(coins, changeFor);
        System.out.println(ans);
    }
}
