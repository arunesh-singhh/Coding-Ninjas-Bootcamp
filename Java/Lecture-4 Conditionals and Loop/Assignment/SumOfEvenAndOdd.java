import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int evensum = 0;
        int oddsum = 0;

        while(num!=0){
            int n = num % 10;
            if(n%2==0){
                evensum = evensum + n;
            }
            else{
                oddsum = oddsum + n;
            }
            num = num / 10;
        }
        System.out.print(evensum + " ");
        System.out.print(oddsum);

    }
}
