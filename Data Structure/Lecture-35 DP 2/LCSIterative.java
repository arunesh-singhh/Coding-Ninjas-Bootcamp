import java.util.Scanner;

public class LCSIterative {
    public static int lcsIDP(String s, String t){
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m+1; i++) {
            for (int j = 0; j < n+1; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                }
                else{
                    int ans1 = dp[i+1][j];
                    int ans2 = dp[i][j+1];
                    dp[i][j] = Math.max(ans1, ans2); 
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        int ans = lcsIDP(s, t);
        System.out.println(ans);
    }
}
