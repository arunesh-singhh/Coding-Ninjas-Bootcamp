import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 1, count = 1; count <= n; i++) {
            int num = 3*i+2;
            if (num%4 != 0) {
                System.out.print(num + " ");
                count++;
            }
        }
    }
}
