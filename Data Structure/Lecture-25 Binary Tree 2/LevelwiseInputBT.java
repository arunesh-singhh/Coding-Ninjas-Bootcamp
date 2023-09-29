import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelwiseInputBT {
    public static BinaryTreeNode<Integer> levelwiseInputBT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the root ");
        int rootdata = sc.nextInt();

        if (rootdata == -1) {
            sc.close();
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChild.add(root);

        while(!pendingChild.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingChild.remove();
            // for left child
            System.out.print("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(leftChild);
                front.left = left;
                pendingChild.add(left);
            }
            // for right child
            System.out.print("Enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(rightChild);
                front.right = right;
                pendingChild.add(right);
            }
        }

        sc.close();
        return root;
    }

    public static void main(String[] args) {
        //BinaryTreeNode<Integer> root = levelwiseInputBT();
    }
}
