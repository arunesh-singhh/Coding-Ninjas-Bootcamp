package Assignment;
import java.util.Scanner;

public class InvertedNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*
            for n = 4
            4444
            333
            22
            1 
        */
        int i = 1;
        while (i <= n) {
            // for stars
            int stars = 1;
            while (stars <= n+1-i) {
                System.out.print(n+1-i);
                stars++;
            }
            System.out.println();
            i++;
        }
    }
}