import java.util.Scanner;

public class CheckPrime {

    public static boolean checkPrime(int n){
        int div = 2;
        while (div <= n/2) {
            if (n % div == 0) {
                return false;
            }
            div += 1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPrime(n));
        sc.close();
    }
}
