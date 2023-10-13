import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        /*  
            ABCD
            ABCD
            ABCD
            ABCD
        */
        int i = 1;
        while (i <= n ) {
            int j = 0;
            while (j < n) {
                System.out.print((char)('A'+j));
                j++;
            }
            System.out.println();
            i++;
        }

        /*  
            ABCD
            BCDE
            CDEF
            DEFG
        */
        i = 1;
        while (i <= n ) {
            int j = 1;
            while (j <= n) {
                System.out.print((char)(63+i+j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
