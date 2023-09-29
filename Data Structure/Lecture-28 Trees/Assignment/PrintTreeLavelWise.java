package Assignment;
import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeLavelWise {
    public static void printLevelWise(TreeNode<Integer> root){
        if (root==null) {
            return;
        }
        Queue<TreeNode<Integer>> nodesToPrint = new LinkedList<TreeNode<Integer>>();
        nodesToPrint.add(root);
        nodesToPrint.add(null);

        while(nodesToPrint.size() != 1){
            TreeNode<Integer> front = nodesToPrint.poll();
            if (front == null) {
                nodesToPrint.add(null);
                System.out.println();
            }
            else{
                System.out.print(front.data+" ");
                for (int i = 0; i < front.children.size(); i++) {
                    nodesToPrint.add(front.children.get(i));
                }
            }  
        }
    }

    // public static void printLevelWise(TreeNode<Integer> root){
    //     if (root == null){
    //         return;
    //     }
    //     Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();    // Create a queue
    //     pendingNodes.add(root); 

    //     while (!pendingNodes.isEmpty()){
    //         int n = pendingNodes.size();
    //         // If this node has children
    //         while (n > 0) {
    //             // remove an item from queue and print it
    //             TreeNode<Integer> front = pendingNodes.remove();
    //             System.out.print(front.data + " ");
    //             // add all children of the removed item
    //             for (int i = 0; i < front.children.size(); i++){
    //                 pendingNodes.add(front.children.get(i));
    //             }
    //             n--;
    //         }
    //         // Print new line between two levels
    //         System.out.println();
    //     }
}