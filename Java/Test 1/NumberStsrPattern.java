import java.util.Scanner;

public class NumberStsrPattern {
    
    public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        s.close();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (i == j) {
					System.out.print("*");
				}
				else{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
