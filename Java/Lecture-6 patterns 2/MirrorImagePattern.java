import java.util.Scanner;

public class MirrorImagePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*
            for n = 4
               *
              **
             ***
            **** 
        */
        int i = 1;
        while (i <= n) {
            // for Spaces
            int spaces = 1;
            while (spaces <= n-i) {
                System.out.print(" ");
                spaces++;
            }
            // for stars
            int stars = 1;
            while (stars <= i) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}