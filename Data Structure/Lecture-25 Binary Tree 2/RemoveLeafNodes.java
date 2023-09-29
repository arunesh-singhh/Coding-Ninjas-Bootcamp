// RemoveLeafNodes

public class RemoveLeafNodes {

    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root){
        // if(root==null) {
        //     return null;
        // }
        // if(root.left==null && root.right==null) {
        //     return null;
        // }
        if(root==null || (root.left==null && root.right==null)) {
            return null;
        }
        
        root.left = removeLeafNodes(root.left);
        root.right = removeLeafNodes(root.right);
        return root;
    }
}