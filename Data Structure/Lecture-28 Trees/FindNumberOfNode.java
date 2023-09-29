public class FindNumberOfNode {
    public static int numberOfNodes(TreeNode<Integer>root){
        if (root == null ) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            int childCount = numberOfNodes(root.children.get(i));
            count += childCount;
        }
        return count;
    }
}
