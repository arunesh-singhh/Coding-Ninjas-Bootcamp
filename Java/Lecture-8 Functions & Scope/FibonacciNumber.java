public class FibonacciNumber {
    public static boolean checkMember(int n){
		if (n == 0  ||n == 1) {
			return true;
		}

		int n1 = 1, n2 = 2;
		while (n2 <= n) {
			if (n2 == n) {
				return true;
			}
			int temp = n2;
			n2 = n1 + n2;
			n1 = temp;
		}
        return false;
	}
}
