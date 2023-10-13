package Assignment;
import java.util.Scanner;

public class Staircase {
    
    // using recursion function
    public static long staircase(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        long ans1, ans2, ans3 = 0;
        ans1 = staircase(n-1);
        ans2 = staircase(n-2);
        if (n-3 >= 0) {
            ans3 = staircase(n-3);
        }
        long ans = ans1 + ans2 + ans3;
        return ans;
    }

    // using DP
    public static long staircaseDP(int n){
        long [] dp = new long[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return staircaseDP(n, dp);
    }
    public static long staircaseDP(int n, long[] dp){
        if (n == 0 || n == 1) {
            return 1;
        }
        long ans1, ans2, ans3 = 0;
        // check for n-1
        if (dp[n-1] == -1) {
            ans1 = staircaseDP(n-1, dp);
            dp[n-1] = ans1;
        }
        else{
            ans1 = dp[n-1];
        }
        // check for n-2
        if (dp[n-2] == -1) {
            ans2 = staircaseDP(n-2, dp);
            dp[n-2] = ans2;
        }
        else{
            ans2 = dp[n-2];
        }
        // check for n-3
        if (n-3 >= 0){
            if (dp[n-3] == -1) {
                ans3 = staircaseDP(n-3, dp);
                dp[n-3] = ans3;
            }
            else{
                ans3 = dp[n-3];
            }
        }
        long ans = ans1 + ans2 + ans3;
        return ans;
    }

    // using itrative DP
    public static long staircaseIDP(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long ans = staircaseIDP(n);
        System.out.println(ans);
    }
}
