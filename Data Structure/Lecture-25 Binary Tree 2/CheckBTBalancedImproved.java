class BalancedTreeReturn {
    int height;
    boolean isBalanced;
}

public class CheckBTBalancedImproved {
    
    public static BalancedTreeReturn checkBTBalancedImprovedheckBT(BinaryTreeNode<Integer> root){
        if (root == null) {
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = 0;
            ans.isBalanced = true;
            return ans;
        }

        BalancedTreeReturn leftCheck = checkBTBalancedImprovedheckBT(root.left);
        BalancedTreeReturn rightCheck = checkBTBalancedImprovedheckBT(root.right);

        boolean isbal = true;
        int height = 1 + Math.max(leftCheck.height, rightCheck.height);
        if (Math.abs(leftCheck.height - rightCheck.height) > 1) {
            isbal = false;
        }
        if (!leftCheck.isBalanced || !rightCheck.isBalanced) {
            isbal = false;
        }
        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isbal;
        return ans;
    }
}
