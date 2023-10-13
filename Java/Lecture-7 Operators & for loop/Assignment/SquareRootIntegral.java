import java.util.Scanner;

public class SquareRootIntegral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sqrRoot = 0;
        while (sqrRoot * sqrRoot <= n ) {
            sqrRoot++;
        }
        sqrRoot--;
        System.out.println(sqrRoot);
    }
}
