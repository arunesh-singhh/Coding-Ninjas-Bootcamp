package Assignment;

public class CountLeafNode {
    public static int countLeafNodes(TreeNode<Integer> root){
        int ans = 0;
        if (root == null ){
            return ans;
        }
        if (root.children.size() == 0) {
            return 1;
        }
        for (int i = 0; i < root.children.size(); i++) {
            ans += countLeafNodes(root.children.get(i));
        }
        return ans ;

	}
}
