import java.util.Scanner;

public class InputOutputArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+ i +"th index");
            arr[i]=s.nextInt();
        }
        s.close();

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}