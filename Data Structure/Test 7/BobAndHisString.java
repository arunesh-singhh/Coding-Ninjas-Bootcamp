/*
    Bob and his string

    King Bob is in playful mood today. He started playing with string S. As he was playing, a weird question came in his mind. He wondered what is the maximum number of characters, between any two same characters in the string. He needs your help in solving this question. Can you help him solve this question?
    Note: String S is composed of lowercase letters of the Latin alphabet. If there are no two same characters in the string, print -1.
    Input Format:
    The first line of input contains one integer T, denoting the number of test cases. 
    Each of the next T line contains one string S.
    Constraints:
    1 < T < 10
    1 < |S| < 100000, where S determines the length of the string.
    String is composed of lowercase alphabets ranging from a to z.
    Time limit : 1 sec
    Output Format:
    For each test case, output the maximum number of characters between any two same characters in the string. If there are no two same characters in the string, print -1. 
    Print answer for each test case in a new line.
    Sample Input 1:
    2
    aba
    babcddc
    Sample Output 1:
    1
    2
    Explanation:
    1) For string = aba
    There is only one character between 2 occurrences of a.

    2) For string = babcddc
    There is one character between 2 occurrences of b, and 2 characters between 2 occurrences of c. So the answer is 2.
*/

import java.util.Scanner;

public class BobAndHisString {
    // using recursion
    public static int maxLength(String str, int i, int j){
		if (i >= j) {
			return 0;
		}
		if (str.charAt(i) == str.charAt(j)) {
			return (j - i - 1);
		}
		int ans1 = maxLength(str, i+1, j);
		int ans2 = maxLength(str, i, j-1);
		int ans = Math.max(ans1, ans2);
        return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			String str = sc.next();
            int ans = maxLength(str, 0, str.length()-1);
			System.out.println(ans);
			t--;
		}
        sc.close();
	}
}