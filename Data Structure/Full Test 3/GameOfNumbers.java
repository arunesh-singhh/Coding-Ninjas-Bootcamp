import java.util.Scanner;

public class GameOfNumbers {
    
    public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int operations = 0;
        /* run while loop until y != x */
		while (y != x) {
			if (y > x) {
				if (y % 2 == 0) {
					y = y/2;
					operations++;
				}
				else {
					y++;
					operations++;
				}
			}
			else if (x > y) {
				y++;
				operations++;
			}
		}	
	System.out.println(operations);
	}
}
