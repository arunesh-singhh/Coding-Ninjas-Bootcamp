package Assignment;
import java.util.Scanner;

public class OddSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int max = 2*n-1;
        int row = 1;
        while (row <= n) {
            int num = 2*row-1;
            int col = 1;
            while (col <= n) {
                System.out.print(num);
                if (num < max) {
                    num += 2;
                }
                else{
                    num = 1;
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
