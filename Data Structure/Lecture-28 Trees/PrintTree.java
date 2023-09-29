public class PrintTree {
    public static void printTree(TreeNode<Integer> root) {
        
        if (root == null) {  // this is not the base case its spacial case
            return;
        }
        System.out.print(root.data + " ");
        for (int i = 0; i < root.children.size(); i++) {   // base case is handaled in for loop 
            printTree(root.children.get(i));
        }
    }
}
