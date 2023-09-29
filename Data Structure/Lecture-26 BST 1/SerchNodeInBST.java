public class SerchNodeInBST {
    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {

		if (root == null) {
			return false;
		}
		if (root.data == k) {
			return true;
		}
		if (k < root.data) {
			return searchInBST(root.left, k);
		}
		return searchInBST(root.right, k);
	}
}
