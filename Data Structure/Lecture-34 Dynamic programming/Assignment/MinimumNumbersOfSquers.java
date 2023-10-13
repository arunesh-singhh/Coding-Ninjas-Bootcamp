package Assignment;

import java.util.Scanner;

public class MinimumNumbersOfSquers {
    // using recursion function
    public static int minCount(int n){
        if (n == 0) {
            return 0;
        }
        
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i*i <= n; i++) {
            int ans1 = minCount(n-i*i);
            if (ans1 < ans) {
                ans = ans1;
            }
        }
        return ans+1;
    }

    // using DP
    public static int minCountDP(int n){
        int [] dp = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return minCountDP(n, dp);
    }
    public static int minCountDP(int n, int[] dp){
        if (n == 0) {
            return 0;
        }

        int minans = Integer.MAX_VALUE;
        for (int i = 1; i*i <= n; i++) {
            int ans;
            if (dp[n-(i*i)] == -1) {
                ans = minCountDP(n-i*i, dp);
                dp[n-(i*i)] = ans;
            }
            else{
                ans = dp[n-(i*i)];
            }
            if (ans < minans) {
                minans = ans;
            }  
        }
        return minans+1;
    }


    // using itrative DP
    public static int minStepsToOneIDP(int n){
        int dp[]=new int[n+1];
        dp[0]=0;

        for(int i=1; i<=n; i++)
        {
            int minans = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                int ans = dp[n-(j*j)];
                if (ans < minans) {
                    minans = ans;
                }  
            }
            dp[i] = minans+1;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = minCount(n);
        System.out.println(ans);
    }
}
