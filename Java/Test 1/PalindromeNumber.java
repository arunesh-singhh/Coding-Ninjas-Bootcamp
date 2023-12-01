public class PalindromeNumber {

    public static boolean palindromeNumber(int n){
        
        int temp = n, revNum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            temp = temp / 10;
            revNum = revNum * 10 + lastDigit;
        }
        if (n == revNum) {
            return true;
        } else {
            return false;
        }
    }
}