import java.util.ArrayList;
import java.util.Arrays;

public class GetAllUniqueSubset {

    //This appoach not work for dublicates
    // public static void printSubsets(int input[],int si, int output[]) {
    //     if(si==input.length) {
    //         for (int i : output) {
    //             System.out.print(i+" ");
    //         }
    //         System.out.println();
    //         return;
    //     }
    
    //     printSubsets(input, si+1, output);
    //     int newOutput[] = new int[output.length+1];
    //     int i;
    //     for ( i = 0; i < newOutput.length-1; i++) {
    //         newOutput[i] = output[i];
    //     }
    //     newOutput[i] = input[si];
    //     printSubsets(input, si+1, newOutput);
        
    // }

    // public static void printSubsets(int input[]){
    //     int[] output = new int[0]; 
    //     printSubsets(input,0 , output);
    // }

    public static void printSubsets(int[] input) {
        ArrayList<ArrayList<Integer>> subsets = getSubsets(input);
        // Print the subsets
        for (ArrayList<Integer> subset : subsets) {
            for (int num : subset) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> getSubsets(int[] input) {
        // Sort the input array (if it's not already sorted)
        Arrays.sort(input);
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        ArrayList<Integer> currentSubset = new ArrayList<>();
        generateSubsets(input, 0, currentSubset, subsets);
        return subsets;
    }

    private static void generateSubsets(int[] input, int index, ArrayList<Integer> currentSubset,ArrayList<ArrayList<Integer>> subsets) {
        // Add the current subset to the list of subsets
        subsets.add(new ArrayList<>(currentSubset));
        for (int i = index; i < input.length; i++) {
            // Skip duplicates
            if (i > index && input[i] == input[i - 1])
                continue;
            // Add the current element to the subset
            currentSubset.add(input[i]);
            // Recursively generate subsets starting from the next index
            generateSubsets(input, i + 1, currentSubset, subsets);
            // Remove the current element from the subset to backtrack
            currentSubset.remove(currentSubset.size() - 1);
        }
    }  
}