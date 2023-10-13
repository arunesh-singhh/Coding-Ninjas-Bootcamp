package Assignment;
import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int row = 1;
        while (row <= n) {
            int col = 1;
            int sum = 0;
            while (col <= row) {
                sum += col;
                System.out.print(col);
                if (col == row) {
                    System.out.print("=");
                } 
                else {
                    System.out.print("+");
                }
                col++;
            }
            System.out.println(sum);
            row++;
        }
    }
}
