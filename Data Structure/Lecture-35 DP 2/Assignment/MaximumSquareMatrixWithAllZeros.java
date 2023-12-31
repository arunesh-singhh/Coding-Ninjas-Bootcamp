package Assignment;

public class MaximumSquareMatrixWithAllZeros {
    public static int findMaxSquareWithAllZeros(int[][] input){
        int max = 0;
		int m = input.length;
		if (m == 0) {
			return 0;
		}
		int n = input[0].length;

		int[][] dp = new int[m][n];
		for (int i = 0; i < m; i++) {
			if(input[i][0] == 0){
				dp[i][0] = 1; 
				max = 1;
			}
			else{
				dp[i][0] = 0;
			}
		}
		for (int i = 1; i < n; i++) {
			if(input[i][0] == 0){
				dp[0][i] = 1; 
				max = 1;
			}
			else{
				dp[0][i] = 0;
			}
		}
	
	    for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if(input[i][j] == 0){
					dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
				}
				else{
					dp[i][j] = 0;
				}
				if (dp[i][j] > max) {
				    max = dp[i][j];
			    }
			}
		}
		return max;
	}
}