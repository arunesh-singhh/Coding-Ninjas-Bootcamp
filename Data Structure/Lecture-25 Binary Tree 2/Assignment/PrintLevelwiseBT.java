package Assignment;

import java.util.Queue;
import java.util.LinkedList;
public class PrintLevelwiseBT {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> pendingChild = new LinkedList<BinaryTreeNode<Integer>>();
        pendingChild.add(root);

		while (!pendingChild.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingChild.remove();
            System.out.print(front.data + ":L:");
            // for left child
            if (front.left != null) {
                System.out.print(front.left.data + ",R:");
                pendingChild.add(front.left);
            }
            else{
                System.out.print("-1" + ",R:");
            }
            // for right child
            if (front.right != null) {
                System.out.println(front.right.data);
                pendingChild.add(front.right);
            }
            else{
                System.out.println("-1");
            }
		}
	}
	
}