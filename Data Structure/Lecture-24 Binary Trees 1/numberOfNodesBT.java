public class numberOfNodesBT extends takeTreeInputImproved {

    public static int nodeNum(BinaryTreeNode<Integer> root){
        if (root == null) {
            return 0;
        }
        int leftcount = nodeNum(root.left);
        int rightcount = nodeNum(root.right);
        return 1 + leftcount + rightcount;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = inputTree(true, 0, true);

        //printTreeDetailed(root);
        System.out.println(nodeNum(root));
    }
}
