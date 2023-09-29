import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        int a , b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);

        sc.nextDouble();               // for double type input
        sc.nextLong();                 // for long type input
        String str = sc.next();        // take input a single word
        String srt1 = sc.nextLine();   // take input of intire line
        char ch = str.charAt(0); // take first charecter from str
        System.out.println(str + srt1 + ch);

        sc.close();   // for closing the Scanner
    }
}
