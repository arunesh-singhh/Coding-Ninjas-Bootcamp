package Assignment;

public class InsertDuplicateNode {
    public static BinaryTreeNode<Integer> insertDuplicateNode(BinaryTreeNode<Integer> root){
        if (root == null) {
            return null;
        }
        BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<Integer>(root.data);
        duplicateNode.left = root.left;
        root.left = duplicateNode;

        insertDuplicateNode(duplicateNode.left);
        insertDuplicateNode(root.right);

        return root;
    }
}
