/*
    Time Complexity : O(N + M)
    Space Complexity : O(max(N, M))

    Where 'N' and 'M' are the lengths of the string 'A' and 'B' respectively.
*/

import java.util.Scanner;

public class BinarySum {

	public static String addBinaryString(String a, String b, int n, int m) 
	{
		StringBuilder sum = new StringBuilder();
		int i = 0;
		int carry = 0;

		while (i < Math.max(n, m)) {
			int curSum = carry;
			if (i < n) {
				curSum = curSum + (a.charAt(n - 1 - i) - '0');
			}
			if (i < m) {
				curSum = curSum + (b.charAt(m - 1 - i) - '0');
			}
			sum.append((curSum) % 2 );
			carry = curSum / 2;
			i++;
		}
		if (carry != 0) {
			sum.append(1);
		}
		return sum.reverse().toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			String str1 = sc.next();
			String str2 = sc.next();
			String ans = addBinaryString(str1, str2, str1.length(), str2.length());
			System.out.println(ans);
		}
        sc.close();
	}
}