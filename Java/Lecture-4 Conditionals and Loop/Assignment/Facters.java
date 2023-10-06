import java.util.Scanner;

public class Facters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int div = 2;
        boolean isprime = true;

        while (div <= n/2) {
            if (n % div == 0) {
                System.out.print(div + " ");
                isprime = false;
            }
            div++;
        }
        if (isprime) {
            System.out.println("-1");
        }
    }
}
