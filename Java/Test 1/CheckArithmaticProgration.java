import java.util.Scanner;

public class CheckArithmaticProgration {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		int pre = s.nextInt();
		int current = s.nextInt();
		int count = 3;
        s.close();

		int d = current - pre;
		pre = current;

		while (count <= n) {
			current = s.nextInt();
			int temp = current - pre;
			if (temp != d) {
				System.out.println("false");
				return;
			}
			count++;
			pre = current;
		}
		System.out.println("true");
    }
}
