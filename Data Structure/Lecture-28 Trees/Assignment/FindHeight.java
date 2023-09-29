package Assignment;

public class FindHeight {
    public static int getHeight(TreeNode<Integer> root){
        int height = 0;
        if (root == null ){
            return height;
        }
        if (root.children == null) {
            return 1;
        }
        for (int i = 0; i < root.children.size(); i++) {
            height = Math.max(height, getHeight(root.children.get(i)));
        }
        return height+1;

        // int height = 0;
        // if (root == null ){
        //     return height;
        // }
        // if (root.children == null) {
        //     return 1;
        // }
        // for (TreeNode<Integer> child : root.children) {
        //    height = Math.max(height, getHeight(child));
     	// }
        // return height + 1;
	}
}
