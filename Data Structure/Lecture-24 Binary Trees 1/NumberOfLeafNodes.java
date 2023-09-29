public class NumberOfLeafNodes {
    public static int numberOfLeafNodes(BinaryTreeNode<Integer> root) {
        
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }

        // int leftCount = numberOfLeafNodes(root.left);
        // int rightCount = numberOfLeafNodes(root.right);
        // return leftCount + rightCount;

        return numberOfLeafNodes(root.left) + numberOfLeafNodes(root.right);
    }
}
