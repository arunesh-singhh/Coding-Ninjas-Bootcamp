import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*
            for n = 4
            ****
            ***
            **
            * 
        */
        int i = 1;
        while (i <= n) {
            // for stars
            int stars = 1;
            while (stars <= n+1-i) {
                System.out.print("*");
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}