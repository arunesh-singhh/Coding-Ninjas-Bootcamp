import java.util.Scanner;

public class PrintEvenStartTillEnd {

    public static void printEven(int start, int end){
        if (start % 2 != 0) {
            start++;
        }
        for (int i = start; i <= end; i+=2) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();

        printEven(start, end);

    }
}
