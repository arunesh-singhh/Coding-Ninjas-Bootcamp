package Assignment;
import java.util.Scanner;

public class CharacterPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        /*  
            A
            BC  
            CDE
            DEFG
        */
        int i = 1;
        while (i <= n ) {
            int j = 1;
            while (j <= i) {
                System.out.print((char)(63+i+j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
