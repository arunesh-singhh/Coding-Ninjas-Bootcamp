package Assignment;

public class NextLargerElement {
    static TreeNode<Integer> res =null; 
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){ 
		if (root == null) {
            return null;
        }
        // if root is less than res but greater than n, update res 
        if (root.data > n) {
            if (res==null || root.data<res.data){
                res = root; 
            }
        }
    
        for (int i = 0; i < root.children.size(); i++) {
             findNextLargerNode(root.children.get(i),n); 
        }
		return res;
    }
}
