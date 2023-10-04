public class PrintFactorial {

    public static void factorial(int n, int ans){
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        ans *= n;
        factorial(n-1, ans);
    }
    public static void main(String[] args) {
        int n = 5;
        factorial(n, 1);
    }
}