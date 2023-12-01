package Assignment;
import java.util.Scanner;

public class EditDistence {

    // using recursion

    // public static int editDistence(String s, String t, int i, int j){
    //     if (i >= s.length() && j >= t.length()) {
    //         return 0;
    //     }
    //     else if (i >= s.length()) {
    //         return t.substring(j).length();
    //     }
    //     else if (j >= t.length()) {
    //         return s.substring(i).length();
    //     }

    //     int ans;
    //     if (s.charAt(i) == t.charAt(j)) {
    //         ans = editDistence(s, t, i+1, j+1);
    //     }
    //     else{
    //         int ans1 = 1 + editDistence(s, t, i+1, j+1);
    //         int ans2 = 1 + editDistence(s, t, i+1, j);
    //         int ans3 = 1 + editDistence(s, t, i, j+1);
    //         ans = Math.min(ans1, Math.min(ans2, ans3));
    //     }
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String str1 = sc.next();
    //     String str2 = sc.next();
    //     sc.close();

    //     int ans = editDistence(str1, str2, 0, 0);
    //     System.out.println(ans);
    // }


    // using memorization 

    // public static int editDistenceDP(String s, String t, int i, int j, int[][] dp){
    //     int m = s.length();
    //     int n = t.length();

    //     if (m == 0 && n == 0) {
    //         return 0;
    //     }
    //     if (m == 0) {
    //         return n;
    //     }
    //     if (n == 0) {
    //         return m;
    //     }

    //     int ans;
    //     if (s.charAt(0) == t.charAt(0)) {
    //         if (dp[i+1][j+1] == Integer.MAX_VALUE) {
    //             ans = editDistenceDP(s.substring(1), t.substring(1), i+1, j+1, dp);
    //             dp[i+1][j+1] = ans;
    //         }
    //         else{
    //             ans = dp[i+1][j+1];
    //         }
    //     }
    //     else{
    //         int ans1, ans2, ans3;
    //         if (dp[i+1][j+1] == Integer.MAX_VALUE) {
    //             ans1 = editDistenceDP(s.substring(1), t.substring(1), i+1, j+1, dp);
    //             dp[i+1][j+1] = ans1;
    //         }
    //         else{
    //             ans1 = dp[i+1][j+1];
    //         }
    //         if (dp[i+1][j] == Integer.MAX_VALUE) {
    //             ans2 = editDistenceDP(s.substring(1), t, i+1, j, dp);
    //             dp[i+1][j] = ans2;
    //         }
    //         else{
    //             ans2 = dp[i+1][j];
    //         }
    //         if (dp[i][j+1] == -1) {
    //             ans3 = editDistenceDP(s, t.substring(1), i, j+1, dp);
    //             dp[i][j+1] = ans3;
    //         }
    //         else{
    //             ans3 = dp[i][j+1];
    //         }
    //         ans = 1 + Math.min(ans1, Math.min(ans2, ans3));
    //         dp[i][j] = ans;
    //     }
    //     return ans;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     String str1 = sc.next();
    //     String str2 = sc.next();
    //     sc.close();

    //     int[][] dp = new int[str1.length()+1][str2.length()+1];
    //     for (int i = 0; i <= str1.length(); i++) {
    //         for (int j = 0; j <= str2.length(); j++) {
    //             dp[i][j] = Integer.MAX_VALUE;
    //         }
    //     }

    //     int ans = editDistenceDP(str1, str2, 0, 0, dp);
    //     System.out.println(ans);
    // }


    // using itrativa dp
    public static int editDistance(String s1, String s2){
        int m=s1.length();
        int n=s2.length();
        if(m==0 && n==0)
            return 0;
        if(m==0)
            return n;
        if(n==0)
            return m;
 
        int dp[][]=new int[m+1][n+1];
        dp[0][0]=0;
        for(int i=1;i<=n;i++)
            dp[0][i]=i;
        for(int i=1;i<=m;i++)
            dp[i][0]=i;
 
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(m-i)==s2.charAt(n-j))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
                }
                }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        sc.close();

        int ans = editDistance(str1, str2);
        System.out.println(ans);
    }
}





// coding ninza solution

/*
Time Complexity : O(M * N)
Space Complexity : O(M * N)
Where M and N are the lengths of string 's' and 't' respectively
*/
// public class Solution {
//     private static int editDistanceHelper(String s, String t, int[][] subProblems) {
//         if(s.length() == 0) {
//         return t.length();
//     }
//     if(t.length() == 0) {
//         return s.length();
//     }
//     int m = s.length();
//     int n = t.length();
//     if (subProblems[m][n] != -1) {
//         return subProblems[m][n];
//     }
//     if (s.charAt(0) == t.charAt(0)) {
//         int smallAns = editDistanceHelper(s.substring(1), t.substring(1), subProblems);
//         subProblems[m - 1][n -1] = smallAns;
//         subProblems[m][n] = 0 + smallAns;
//     } else {
//         int remove = editDistanceHelper(s.substring(1), t, subProblems);
//         subProblems[m - 1][n] = remove;
//         int insert = editDistanceHelper(s, t.substring(1), subProblems);
//         subProblems[m][n - 1] = insert;
//         int substitute = editDistanceHelper(s.substring(1), t.substring(1), subProblems);
//         subProblems[m - 1][n -1] = substitute;

//         subProblems[m][n] = 1 + Math.min(remove, Math.min(insert, substitute));
//     }
//     return subProblems[m][n];
//     }

//     public static int editDistance(String s, String t) {
//         int m = s.length();
//         int n = t.length();
//         int[][] subProblems = new int[(m + 1)][(n + 1)];
//         //Assigning all the values with -1
//         for (int i = 0; i <= m; i++) {
//             for (int j = 0; j <= n; j++) {
//                 subProblems[i][j] = -1;
//             }
//         }
//         return editDistanceHelper(s, t, subProblems);
//     }
// }
