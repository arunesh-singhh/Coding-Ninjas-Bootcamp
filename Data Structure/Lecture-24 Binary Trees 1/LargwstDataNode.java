public class LargwstDataNode {
    public static int largestDataNode(BinaryTreeNode<Integer> root) {
        
        if (root == null) {
            return -1;
        }
        int leftLargest = largestDataNode(root.left);
        int rightLargest = largestDataNode(root.right);
        return Math.max(root.data, Math.max(leftLargest, rightLargest));
    }
}
