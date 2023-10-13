package Assignment;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*  for n = 4
            1111
            2222
            3333
            4444
        */
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }

        /*  for n = 4
            1234
            1234
            1234
            1234
        */
        i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }

        /*  for n = 4
            4321
            4321
            4321
            4321
        */
        i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(n-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
