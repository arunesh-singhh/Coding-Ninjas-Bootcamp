import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        long ans = 0, pow = 1;
		while(n != 0) {
			int lastbit = n % 2;
            ans = ans + lastbit * pow;
            n = n / 2;
            pow *= 10;
		}
        System.out.println(ans);
	}
}
