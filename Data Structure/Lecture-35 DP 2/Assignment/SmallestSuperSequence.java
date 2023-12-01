package Assignment;

public class SmallestSuperSequence {
    public static int smallestSuperSequence(String str1, String str2) {

        int m = str1.length();
	    int n = str2.length(); 

		int[][] dp = new int[m+1][n+1];
		dp[m][n] = 0;
		for (int i = m-1; i >= 0; i--) {
			dp[i][n] = m-i;
		}
		for (int i = n-1; i >= 0; i--) {
			dp[m][i] = n-i;
		}
	
	    for (int i = m-1; i >= 0; i--) {
			for (int j = n-1; j >= 0; j--) {

				if (str1.charAt(i) == str2.charAt(j)) {
					dp[i][j] = 1 + dp[i+1][j+1]; 
				}
				else{
					dp[i][j] = 1 + Math.min(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		return dp[0][0];
	}
}


/*
Time Complexity: O(n*m)
Space Complexity: O(n*m)
where n and m are lengths of input strings
*/

// public class SmallestSuperSequence {
// 	public static int smallestSuperSequence(String str1, String str2) {
// 		int len1 = str1.length();
// 		int len2 = str2.length();
// 		int superseq[][]= new int[len1+1][len2+1];

// 		for(int p=0; p<=len1; p++){
// 		    for(int q=0; q<=len2; q++){
// 				if(p==0){
// 					superseq[p][q]=q;
// 				}
// 				else if(q==0){
// 				    superseq[p][q]=p;
// 				}
// 				else if(str1.charAt(p-1) == str2.charAt(q-1)){
// 					superseq[p][q]=1+superseq[p-1][q-1];
// 				}
// 				else{
// 					superseq[p][q] = 1 + Math.min(superseq[p-1][q], superseq[p][q-1]);
// 				}
// 	        }
// 		}
// 		return superseq[len1][len2];
// 	}
// }
