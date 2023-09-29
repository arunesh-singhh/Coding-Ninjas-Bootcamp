public class PrintTreeImproved {
    public static void printTree(TreeNode<Integer> root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + ": ");
        for (int i = 0; i < root.children.size(); i++) {
            System.out.print((root.children.get(i).data) + " ");
        }
        System.out.println();
        for (int i = 0; i < root.children.size(); i++) {  
            printTree(root.children.get(i));
        }
    }
}
