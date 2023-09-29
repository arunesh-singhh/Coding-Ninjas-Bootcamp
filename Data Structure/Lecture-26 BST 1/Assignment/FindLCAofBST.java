package Assignment;

public class FindLCAofBST {
    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root == null)
            return -1;
        if(root.data == a || root.data == b)
            return root.data;

        int c = getLCA(root.left,a,b);
        int d = getLCA(root.right,a,b);
        if(c == -1 && d == -1)
            return -1;
        else if(c == -1 && d != -1)
            return  d;
        else if(c != -1 && d == -1)
            return c;
        else
            return root.data;
	}
}
