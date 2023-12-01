package Assignment;

public class SubsetSum {

    // using recursion
    static boolean isSubsetPresent(int[] arr, int n, int sum) {

        if (sum == 0) {
            return true;
        }
        if (n <= 0 && sum != 0) {
            return false;
        }

        // include the last element in the search - exclude last element from search
        return isSubsetPresent(arr, n - 1, sum) || isSubsetPresent(arr, n - 1, sum - arr[n - 1]);
    }

    // using itrativa DP
    public static boolean isSubsetSumDP(int[] s, int n, int sum) {
        boolean[][] dp = new boolean[n + 1][sum + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i <= sum; i++) {
            dp[0][i] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= s[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - s[i - 1]];
                }
            }
        }

        return dp[n][sum];
    }
}
