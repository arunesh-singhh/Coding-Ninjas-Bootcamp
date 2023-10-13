package Assignment;
import java.util.Scanner;

public class MinStepsToOne {
    // using recursion function
    public static int minStepsToOne(int n){
        if (n == 1) {
            return 0;
        }
    
        int ans1 = Integer.MAX_VALUE, ans2 = Integer.MAX_VALUE, ans3 = Integer.MAX_VALUE;
        ans1 = minStepsToOne(n-1);
        if (n%2 == 0) {
            ans2 = minStepsToOne(n/2);
        }
        if (n%3 == 0) {
            ans3 = minStepsToOne(n/3);
        }
        
        int ans = 1 + Math.min(ans1, Math.min(ans2, ans3));
        return ans;
    }

    // using DP
    public static int minStepsToOneDP(int n){
        int [] dp = new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return minStepsToOneDP(n, dp);
    }
    public static int minStepsToOneDP(int n, int[] dp){
        if (n == 1) {
            return 0;
        }
        // check for n-1
        int ans1;
        if (dp[n-1] == -1) {
            ans1 = minStepsToOneDP(n-1, dp);
            dp[n-1] = ans1;
        }
        else{
            ans1 = dp[n-1];
        }
        // check for n/2
        int ans2 = Integer.MAX_VALUE;
        if (n%2 == 0) {
            if (dp[n/2] == -1) {
                ans2 = minStepsToOneDP(n/2, dp);
                dp[n/2] = ans2;
            }
            else{
                ans2 = dp[n/2];
            }
        }
        // check for n/3
        int ans3 = Integer.MAX_VALUE;
        if (n%3 == 0) {
            if (dp[n/3] == -1) {
                ans3 = minStepsToOneDP(n/3, dp);
                dp[n/3] = ans3;
            }
            else{
                ans3 = dp[n/3];
            }
        }

        int ans = 1 + Math.min(ans1, Math.min(ans2, ans3));
        return ans;
    }

    // using itrative DP
    public static int minStepsToOneIDP(int n){
        int dp[]=new int[n+1];
        dp[1]=0;

        for(int i=2;i<dp.length;i++)
        {
            int op1=Integer.MAX_VALUE;
            int op2=Integer.MAX_VALUE;
            int op3=Integer.MAX_VALUE;
            
            op1=dp[i-1];
            if(i%2==0)
                op2=dp[i/2];
            if(i%3==0)
                op3=dp[i/3];
            dp[i]=1+Math.min(Math.min(op1,op2),op3);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = minStepsToOne(n);
        System.out.println(ans);
    }
}
