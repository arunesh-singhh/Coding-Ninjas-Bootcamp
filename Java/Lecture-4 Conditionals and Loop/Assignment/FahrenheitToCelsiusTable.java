package Assignment;
import java.util.Scanner;

public class FahrenheitToCelsiusTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        int C;
        
        while(S <= E){
            System.out.print(S);
            C = (S - 32) * 5/9;
            System.out.println(" " + C);
            S += W;
        }
        sc.close();
    }
}