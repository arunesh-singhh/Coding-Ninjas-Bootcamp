import java.util.Scanner;

public class ReturnKeypadCode {
    
    public static String getOptions(int digit){
        if (digit == 2) {
            return "abc";
        }
        if (digit == 3) {
            return "def";
        }
        if (digit == 4) {
            return "ghi";
        }
        if (digit == 5) {
            return "jkl";
        }
        if (digit == 6) {
            return "mno";
        }
        if (digit == 7) {
            return "pqrs";
        }
        if (digit == 8) {
            return "tuv";
        }
        if (digit == 9) {
            return "wxyz";
        }
        return "";
    }

    public static String[] KeypadCombination(int input){
        if (input == 0) {
            String[] output = new String[1];
            output[0] = "";
            return output;
        }
        String[] smallOutput = KeypadCombination(input/10);
        int lastDigit = input % 10;
        String lastDigitOption = getOptions(lastDigit);
        String[] output = new String[smallOutput.length * lastDigitOption.length()];

        int k = 0;
        for (int i = 0; i < smallOutput.length; i++) {
            for (int j = 0; j < lastDigitOption.length(); j++) {
                output[k] = smallOutput[i] + lastDigitOption.charAt(j);
                k++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = sc.nextInt();
        String[] ans = KeypadCombination(input);
        for (String string : ans) {
            System.out.println(string);
        }
        sc.close();
    }
}
