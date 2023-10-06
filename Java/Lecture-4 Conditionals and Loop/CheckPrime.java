import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int i = 2;
        while (i <= num/2) {
            if (num % i == 0 ) {
                System.out.println("not prime");
                return;
            }
            i++;
        }
        System.out.println("prime");
    }
}
