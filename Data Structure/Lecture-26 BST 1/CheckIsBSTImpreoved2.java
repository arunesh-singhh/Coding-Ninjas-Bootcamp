public class CheckIsBSTImpreoved2 {
    public static boolean isBST(BinaryTreeNode<Integer> root, int minrange, int maxrange){
        if (root == null) {
            return true;
        }
        if (root.data < minrange || root.data > maxrange) {
            return false;
        }

        boolean leftIsBST = isBST(root.left, minrange, root.data-1);
        boolean rightIsBST = isBST(root.right, root.data, maxrange);
        return leftIsBST && rightIsBST;
    }
}
