import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(n*i);
            i = i + 1;
        }
        sc.close();
	}
}