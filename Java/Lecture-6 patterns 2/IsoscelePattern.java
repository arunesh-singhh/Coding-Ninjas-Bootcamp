import java.util.Scanner;

public class IsoscelePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*
            for n = 4
               1
              121
             12321
            1234321
        */
        int i = 1;
        while (i <= n) {
            // for Spaces
            int spaces = 1;
            while (spaces <= n-i) {
                System.out.print(" ");
                spaces++;
            }
            // for increasing j
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            // for decreasing j
            j = i-1;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
    }
}