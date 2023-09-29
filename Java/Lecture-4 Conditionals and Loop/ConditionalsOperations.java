import java.util.Scanner;

public class ConditionalsOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        if (a>b) {
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }

        System.out.println("always run");
        sc.close();
    }
}