package Assignment;
import java.util.ArrayList;

public class FindPathInBST {
    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            ArrayList<Integer> arrList = new ArrayList<Integer>();
            arrList.add(root.data);
            return arrList;
        }
        if (root.data > data) {
            ArrayList<Integer> leftList = getPath(root.left, data);
            if (leftList != null) {
                leftList.add(root.data);
                return leftList;
            }
        }
        
        else{
            ArrayList<Integer> rightList = getPath(root.right, data);
            if (rightList != null) {
                rightList.add(root.data);
                return rightList;
            }
        }
        return null;
    }
}
