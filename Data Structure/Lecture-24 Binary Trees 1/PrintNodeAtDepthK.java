public class PrintNodeAtDepthK {
    public static void printNodeAtDepthK (BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.print(root.data);
            return;
        }
        printNodeAtDepthK(root.left, k-1);
        printNodeAtDepthK(root.right, k-1);
    }
}
