public class GenericTree extends PrintTreeImproved {
// public class GenericTree extends PrintTree{

    public static void main(String [] args){
        TreeNode<Integer> root = new TreeNode<>(1);
        TreeNode<Integer> root1 = new TreeNode<>(2);
        TreeNode<Integer> root2 = new TreeNode<>(3);
        TreeNode<Integer> root3 = new TreeNode<>(4);
        TreeNode<Integer> root4 = new TreeNode<>(5);
        TreeNode<Integer> root5 = new TreeNode<>(6);

        root.children.add(root1);
        root.children.add(root2);
        root.children.add(root3);

        root2.children.add(root4);
        root2.children.add(root5);
        
        printTree(root);
    }
}
