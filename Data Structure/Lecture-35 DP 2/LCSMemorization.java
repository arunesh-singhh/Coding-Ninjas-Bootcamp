import java.util.Scanner;

public class LCSMemorization {
    public static int lcsDP(int[][] dp, String s, String t, int i, int j){
        if (i == s.length() || j == t.length()) {
            return 0;
        }

        int ans;
        if (s.charAt(i) == t.charAt(j)) {
            if (dp[i+1][j+1] == -1) {
                ans = 1 + lcsDP(dp, s, t, i+1, j+1);
                dp[i+1][j+1] = ans;
            }else{
                ans = 1 + dp[i+1][j+1];
            }
        }
        else{
            int ans1, ans2;
            if (dp[i+1][j] == -1) {
                ans1 = lcsDP(dp, s, t, i+1, j);
                dp[i+1][j] = ans1;
            }else{
                ans1 = dp[i+1][j];
            }
            if (dp[i][j+1] == -1) {
                ans2 = lcsDP(dp, s, t, i, j+1);
                dp[i][j+1] = ans2;
            }else{
                ans2 = dp[i][j+1];
            }
            ans = Math.max(ans1, ans2);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        int[][] dp = new int[s.length()+1][t.length()+1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        int ans = lcsDP(dp, s, t, 0, 0);
        System.out.println(ans);
    }
}
