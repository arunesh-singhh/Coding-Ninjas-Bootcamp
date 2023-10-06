import java.util.Scanner;

public class FindPowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        sc.close();

        int ans = 1;
        while(pow>0){
            ans *= n;
            pow--;
        }
        System.out.println(ans);
    }
}
