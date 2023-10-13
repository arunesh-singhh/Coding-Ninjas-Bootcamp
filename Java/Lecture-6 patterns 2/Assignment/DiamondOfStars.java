package Assignment;
import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*
            for n = 5
               *
              ***
             *****
              ***
               *
        */
        int i = 1;
        int j;
        while (i <= (n+1)/2) {
            // for Spaces
            int spaces = 1;
            while (spaces <= (n+1)/2-i) {
                System.out.print(" ");
                spaces++;
            }
            // for star
            j = 1;
            while (j <= 2*i-1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        i = n/2;
        while (i >= 1) {
            // for Spaces
            j=1;
            while(j<=(n/2)-i +1){
                System.out.print(" ");
                j += 1;
            } 
            j=1;
            while(j<=i*2-1){
                System.out.print("*");
                j += 1;
            }
            System.out.println();
            i--;
        }
    }
}