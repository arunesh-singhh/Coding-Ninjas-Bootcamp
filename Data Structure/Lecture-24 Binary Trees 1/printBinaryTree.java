public class printBinaryTree {
    
    public static void printTree(BinaryTreeNode<Integer>root){
        if(root == null){         // base case
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
    }

    public static void printTreeDetailed(BinaryTreeNode<Integer>root){
        if(root == null){         // base case
            return;
        }
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + " ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
    }
}
