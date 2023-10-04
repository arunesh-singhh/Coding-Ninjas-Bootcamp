import java.util.Scanner;

public class PrintSubsequences {

    public static void printSubsequence(String input, String ch){
        if (input.length() == 0) {
            System.out.println(ch);
            return;
        }
        printSubsequence(input.substring(1), ch);
        printSubsequence(input.substring(1), ch + input.charAt(0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        printSubsequence(str, "");
        sc.close();
    }
}
