package Assignment;
import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*
            // n = 4
            ****
             ****
              ****
               ****
        */

        int row = 1;
        while (row <= n) {
            int spaces = 1;
            while (spaces < row) {
                System.out.print(" ");
                spaces++;
            }
            int stars = 1;
            while (stars <= n) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            row++;
        }
    }
}
