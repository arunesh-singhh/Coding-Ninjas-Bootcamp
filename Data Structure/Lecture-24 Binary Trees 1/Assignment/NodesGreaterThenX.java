package Assignment;

public class NodesGreaterThenX {
    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        if (root == null) {
            return 0;
        }
       
        int leftCheck = countNodesGreaterThanX(root.left, x);
        int rightCheck = countNodesGreaterThanX(root.right, x);

		if (root.data > x){
            return (1 + leftCheck + rightCheck);
        }
        return  leftCheck + rightCheck;
	}
}
