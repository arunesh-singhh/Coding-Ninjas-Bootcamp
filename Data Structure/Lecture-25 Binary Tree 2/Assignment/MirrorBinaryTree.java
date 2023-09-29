package Assignment;

public class MirrorBinaryTree {
    
    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);

    }
}
