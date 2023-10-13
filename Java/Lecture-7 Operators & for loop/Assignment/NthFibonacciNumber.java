
import java.util.Scanner;

public class NthFibonacciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int n1 = 1, n2 = 1;
        for (int i = 3; i <= n; i++) {
            int temp = n2;
            n2 += n1;
            n1 = temp;
        }
        System.out.println(n2);
    }
}