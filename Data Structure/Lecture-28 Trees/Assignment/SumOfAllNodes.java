package Assignment;

public class SumOfAllNodes {
    public static int sumOfNodes(TreeNode<Integer>root){
        if (root == null ) {
            return 0;
        }
        int sum = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int childsum = sumOfNodes(root.children.get(i));
            sum += childsum;
        }
        return sum;
    }
}
