package Assignment;

import java.util.Scanner;

public class IntrestingAlphabets {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        /*  
            E
            DE
            CDE
            BCDE
            ABCDE
        */

        // first way
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=i){
                System.out.print((char)(64+n-i+j));
                j++;
            }
            System.out.println();
            i++;
        }

        // second way
         i = 1;
        while(i<=n){
            int j = 1;
            char cr = (char)(65+n-i);
            while(j<=i){
                System.out.print(cr);
                j++;
                cr++;
            }
            System.out.println();
            i++;
        }
	}
}
