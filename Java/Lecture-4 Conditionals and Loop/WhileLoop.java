import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        // print Hello n times
        int i = 1;
        while (i <= n) {
            System.out.println("Hello");
            i++;
        }

        // print n natural numbers
        int j = 1;
        while (j <= n) {
            System.out.println(j);
            j++;
        }
        s.close();
    }
}
