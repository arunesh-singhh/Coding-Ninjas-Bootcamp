public class CheckBTBalanced {

    public static int height(BinaryTreeNode<Integer> root){
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static boolean checkBTBalanced(BinaryTreeNode<Integer> root){
        if (root == null) {
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        boolean isLeftBalanced = checkBTBalanced(root.left);
        boolean isRightBalanced = checkBTBalanced(root.right);
        
        return isLeftBalanced && isRightBalanced;
    }
    
}
