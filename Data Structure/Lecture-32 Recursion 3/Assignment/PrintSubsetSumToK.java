public class PrintSubsetSumToK {
    public static void printSubsetsSumTokHelper(int[] input, int beginIndex, int[] output, int k){
        if(beginIndex == input.length){
            if(k == 0){
                for(int i : output){
                    System.out.print(i+" ");
                }
                System.out.println();
                return;
            }else{
                return;
            }
        }
        int[] newOutput = new int[output.length+1];
        int i = 0;
        for(; i < output.length; i++){
            newOutput[i] = output[i];
        }
        newOutput[i] = input[beginIndex];
        printSubsetsSumTokHelper(input, beginIndex + 1, output, k);
        printSubsetsSumTokHelper(input, beginIndex + 1, newOutput, k - input[beginIndex]);
    }
    public static void printSubsetsSumTok(int input[], int k) {
        int output[] = new int[0];
        printSubsetsSumTokHelper(input, 0, output, k);
    }
}