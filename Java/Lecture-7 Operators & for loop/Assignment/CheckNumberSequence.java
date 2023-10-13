import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 2, current;
        boolean isdec = true;
        int prev = sc.nextInt();
        while (count <= n) {
            current = sc.nextInt();
            count++;
            if(current == prev) {
                System.out.println("false");
                sc.close();
                return;
            }
            if(current < prev) {
                if(isdec == false) {
                    System.out.println("false");
                    sc.close();
                    return;
                }
            }
            else{
                if(isdec == true) {
                    isdec = false;
                }
            }
            prev = current;
        
        }
        sc.close();
		System.out.println("true");
    }
}