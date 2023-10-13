package Assignment;
import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i = 1;
        while(i<=n){
            int j = 1;
            char cr = (char)(64+i);
            while(j<=i){
                System.out.print(cr);
                j ++;
            }
            System.out.println();
            i ++;
        }
	}
}
