package Assignment;

public class IsNodePresent {
    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if (root == null) {
			return false;
		}
		if (root.data == x) {
			return true;
		}
		// if(isNodePresent(root.left, x)){
		// 	return true;
		// }
		// return isNodePresent(root.right, x);

        return (isNodePresent(root.left, x)) || (isNodePresent(root.right, x));
	}
}
