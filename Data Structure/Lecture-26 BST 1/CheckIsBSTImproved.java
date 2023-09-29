class IsBSTreturn {
    int min;
    int max;
    boolean isBST;
    IsBSTreturn(int min, int max, boolean isBST){
        this.min = min;
        this.max = max;
        this.isBST = isBST;
    }
} 

public class CheckIsBSTImproved {
    public static IsBSTreturn isBST(BinaryTreeNode<Integer> root){
        if (root == null) {
            IsBSTreturn ans = new IsBSTreturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
            return ans;
        }

        IsBSTreturn leftAns = isBST(root.left);
        IsBSTreturn rightAns = isBST(root.right);

        int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
        int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
        boolean isBST = true;

        if (!leftAns.isBST || !rightAns.isBST || leftAns.max >= root.data || rightAns.min < root.data) {
            isBST = false;
        }

        IsBSTreturn ans = new IsBSTreturn(min, max, isBST);
        return ans;
    }
}
