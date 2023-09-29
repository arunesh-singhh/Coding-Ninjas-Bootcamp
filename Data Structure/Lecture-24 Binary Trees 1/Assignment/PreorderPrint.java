package Assignment;

public class PreorderPrint {
    public static void preOrder(BinaryTreeNode<Integer> root) {
		if(root == null){         
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
	}
}
