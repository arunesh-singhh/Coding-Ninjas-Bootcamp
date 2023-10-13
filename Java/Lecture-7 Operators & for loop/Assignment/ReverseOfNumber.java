import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int rNum = 0;
        while (n != 0) {
            rNum = (rNum * 10) + (n % 10);
            n /= 10;
        }
        System.out.println(rNum);
    }
}
