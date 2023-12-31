package Assignment;
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*
            for n = 4
               *
              ***
             *****
            *******
        */
        int i = 1;
        while (i <= n) {
            // for Spaces
            int spaces = 1;
            while (spaces <= n-i) {
                System.out.print(" ");
                spaces++;
            }
            // for star
            int j = 1;
            while (j <= 2*i-1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}