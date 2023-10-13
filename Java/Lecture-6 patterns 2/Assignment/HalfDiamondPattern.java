package Assignment;
import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*
            // n = 3
            *
            *1*
            *121*
            *12321*
            *121*
            *1*
            *
        */
        System.out.println("*");
        int row = 1, incol, deccol;
        while (row <= n) {
            System.out.print("*");
            incol = 1;
            while (incol <= row) {
                System.out.print(incol);
                incol++;
            }
            deccol = row-1;
            while (deccol >= 1) {
                System.out.print(deccol);
                deccol--;
            }
            System.out.println("*");
            row++;
        }
        
        row = n-1;
        while (row >= 1) {
            System.out.print("*");
            incol = 1;
            while (incol <= row) {
                System.out.print(incol);
                incol++;
            }
            deccol = row-1;
            while (deccol >= 1) {
                System.out.print(deccol);
                deccol--;
            }
            System.out.println("*");
            row--;
        }
        System.out.println("*");
    }
}
