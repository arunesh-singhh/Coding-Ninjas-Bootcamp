import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

        int decValue = 0, base = 1;
        while (num != 0) {
            decValue += (base * (num % 10));
            num /= 10;
            base *= 2;
        }
        System.out.println(decValue);
	}
}
