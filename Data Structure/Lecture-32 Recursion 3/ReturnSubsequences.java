import java.util.Scanner;

public class ReturnSubsequences {

    public static String[] Subsequence(String input){
        if (input.length() == 0) {
            String[] output = new String[1];
            output[0] = " ";
            return output;
        }
        String[] smallOutput = Subsequence(input.substring(1));
        String[] output = new String[smallOutput.length * 2];
        for (int i = 0; i < smallOutput.length; i++) {
            output[i] = smallOutput[i];
        }
        for (int i = 0; i < smallOutput.length; i++) {
            output[smallOutput.length + i] = input.charAt(0) + smallOutput[i];
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        String[] ans = Subsequence(str);
        for (String string : ans) {
            System.out.println(string);
        }
        sc.close();
    }
    
}