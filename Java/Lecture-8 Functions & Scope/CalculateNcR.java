import java.util.Scanner;

public class CalculateNcR {

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);

        int ans = factN / (factR * factNR);
        System.out.println(ans);
    }
}