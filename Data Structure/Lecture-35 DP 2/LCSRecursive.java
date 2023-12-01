import java.util.Scanner;

public class LCSRecursive {
    
    public static int lcs(String s, String t){
        if (s.length() == 0 || t.length() == 0) {
            return 0;
        }

        int ans;
        if (s.charAt(0) == t.charAt(0)) {
            ans = 1 + lcs(s.substring(1), t.substring(1));
        }
        else{
            int ans1 = lcs(s.substring(1), t.substring(0));
            int ans2 = lcs(s.substring(0), t.substring(1));
            ans = Math.max(ans1, ans2);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();

        int ans = lcs(s, t);
        System.out.println(ans);
    }
}
