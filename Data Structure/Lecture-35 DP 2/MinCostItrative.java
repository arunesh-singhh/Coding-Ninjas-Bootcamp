public class MinCostItrative {
    // using Itrative DP (Bottom Up Approach)
    public static int minCostIDP(int[][] cost){
        int m = cost.length;
        int n = cost[0].length;
        
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        int ans1, ans2, ans3;
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if(i == m-1 && j == n-1){
                    dp[i][j] = cost[i][j];
                    continue;
                }
                ans1 = dp[i+1][j];
                ans2 = dp[i][j+1];
                ans3 = dp[i+1][j+1];
                dp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
            }
        }
        return dp[0][0];
    }

    // using Itrative DP (Top Down Approach)
    public static int minCostIDP2(int[][] cost){
        int m = cost.length;
        int n = cost[0].length;
        
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        int ans1, ans2, ans3;
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if(i == 1 && j == 1){
                    dp[i][j] = cost[i][j];
                    continue;
                }
                ans1 = dp[i-1][j];
                ans2 = dp[i][j-1];
                ans3 = dp[i-1][j-1];
                dp[i][j] = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        int[][] cost = {{1, 5, 11}, {8, 13, 12}, {2, 3, 7}, {15, 16, 18}};
        
        int ans = minCostIDP(cost);
        System.out.println(ans);
    }
}