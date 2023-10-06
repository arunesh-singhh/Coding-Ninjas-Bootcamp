public class PrintPermutationOfString {
    public static void permutations(String input){
        print(input,"");
	}
    
    private static void print(String input,String output){
        if(input.length() == 0){
            System.out.println(output);
            return;
        }
        
        for(int i=0;i<input.length();i++){
            String str = input.substring(0,i) + input.substring(i+1,input.length());    
            print(str , output + input.charAt(i));
        }
    }
}