import java.util.Scanner;

public class takeTreeInputImproved extends printBinaryTree {

    public static BinaryTreeNode<Integer> inputTree(boolean isroot, int rootdata, boolean isleft){
        if (isroot) {
            System.out.print("Enter root node: ");
        }
        else {
            if (isleft) {
                System.out.print("Enter left child of " + rootdata + " :");
            }
            else {
                System.out.print("Enter right child of " + rootdata + " :");
            }
        }

        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
            
        if (rootData == -1) {
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = inputTree(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = inputTree(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        
        return root;
    }


    // public static void main(String[] args) {
    //     BinaryTreeNode<Integer> root = inputTree(true, 0, true);

    //     printTreeDetailed(root);
    // }
}
