/*
for n = 5
    1234554321
    1234**4321
    123****321
    12******21
    1********1
 */

import java.util.Scanner;

public class NumberStarPatter {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        
		for (int i=0; i<n;i++) { 
			for (int j=1; j<=n-i; j++) {
                System.out.print(j);
            }
		    for (int star=1; star<= 2*i; star++) { 
			    System.out.print("*");
            }
            for (int j=n-i; j>=1; j--) {
				System.out.print(j);
        }
		System.out.println();
		}
	}
}