import java.util.ArrayList;

public class RootToNodePathInBT {
    public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root, int n){
        if (root == null) {
            return null;
        }
        if (root.data == n) {
            ArrayList<Integer> arrList = new ArrayList<Integer>();
            arrList.add(root.data);
            return arrList;
        }

        ArrayList<Integer> leftList = rootToNodePath(root.left, n);
        if (leftList != null) {
            leftList.add(root.data);
            return leftList;
        }

        ArrayList<Integer> rightList = rootToNodePath(root.right, n);
        if (rightList != null) {
            rightList.add(root.data);
            return rightList;
        }
        return null;
    }
}
