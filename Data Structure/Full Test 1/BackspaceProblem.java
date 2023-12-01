public class BackspaceProblem {
    
    public static String backspace(String s){
        // this code is for if # appear in start of the string 
        // if (s.charAt(0) == '#') {
        //     s = s.substring(1);
        //     return s;
        // }

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                s = s.substring(0, i-1) + s.substring(i+1);
                i -= 2;
            }
        }
        return s;
    }
}
