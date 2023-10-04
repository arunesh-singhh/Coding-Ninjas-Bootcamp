import java.util.Scanner;

public class PrintKeypad {
    
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

    public static void printKeypadCombination(int input, String str){
        if (input == 0) {
            System.out.println(str);
            return;
        }
    
        int lastDigit = input % 10;
        String lastDigitOption = getOptions(lastDigit);

        for (int j = 0; j < lastDigitOption.length(); j++) {
            printKeypadCombination(input/10, str + lastDigitOption.charAt(j));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int input = sc.nextInt();
        printKeypadCombination(input, "");
        sc.close();
    }
}

