/*

    Time Complexity : O(N^2)
    Space Complexity : O(N)

    Where N denotes the maximum length of strings from 'FIRST', 'SECOND' and 'THIRD'.

*/

public class AmazingString{
    public static String amazingStrings(String first, String second,String third) {
        int sizeOfThird = third.length();
        int visited[] = new int[sizeOfThird];
    
	    for (int i = 0; i < first.length(); i++) {
             int temp = 0;
             for (int j = 0; j < sizeOfThird; j++) {
                if ((first.charAt(i) == third.charAt(j)) && (visited[j] == 0)) {
                    visited[j] = 1;
                    temp = 1;
                    break;
                }
            }
            
             if (temp == 0) {
                return "NO";
            } 
        }
    
        for (int i = 0; i < second.length(); i++) {
            int temp = 0;
            for (int j = 0; j < sizeOfThird; j++) {
                if (second.charAt(i) == third.charAt(j) && visited[j] == 0) {
                    visited[j] = 1;
                    temp = 1;
                    break;
                }
            }
            if (temp == 0) {
                return "NO";
            }
        }
    
	    for (int i = 0; i < sizeOfThird; i++) {
             if (visited[i] == 0) {
                return "NO";
            }
        }
		return "YES";
    }
}