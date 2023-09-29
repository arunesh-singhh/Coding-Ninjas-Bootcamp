import java.util.Scanner;

public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data){
        this.data = data;
    }


    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.print("Enter root data ");
        }
        else{
            if(isLeft){
              System.out.println("Enter left child of "+ parentData);
            }
            else{
              System.out.println("Enter right child of "+ parentData);
            }
        }
        try (Scanner s = new Scanner(System.in)) {
            int rootData = s.nextInt();

            if(rootData==-1){
                return null;
            }

            BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
            BinaryTreeNode<Integer> leftChild= takeTreeInputBetter(false, rootData, true);
            BinaryTreeNode<Integer> rightChild= takeTreeInputBetter(false, rootData, false);
            root.left= leftChild;
            root.right= rightChild;
            return root;
        }

    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data+":");
        if(root.left != null){
            System.out.print("L"+root.left.data+", ");
            }
        if(root.right != null){
            System.out.print("R"+root.right.data);
            }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);

    }
}