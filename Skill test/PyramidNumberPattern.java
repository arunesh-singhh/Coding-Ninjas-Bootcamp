import java.util.Scanner;

public class PyramidNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*
            for n = 4
               1
              212
             32123
            4321234
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
            int j = i;
            while (j >= 1) {
                System.out.print(j);
                j--;
            }
            // for decreasing j
            j = 2;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}