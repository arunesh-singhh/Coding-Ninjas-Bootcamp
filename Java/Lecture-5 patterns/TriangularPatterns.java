import java.util.Scanner;

public class TriangularPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*  for n = 4
            1
            12
            123
            1234
        */
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }

        /*  for n = 4
            1
            23
            456
            78910
        */
        int k = 1;
        i = 1; 
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(k);
                j++;
                k++;
            }
            System.out.println();
            i++;
        }

        /*  for n = 4
            1
            23
            345
            4567
        */
        i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i+j-1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
