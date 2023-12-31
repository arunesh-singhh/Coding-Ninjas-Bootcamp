package Assignment;

public class ReplaceWithSumOfGreaterNodes {

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		if(root == null){
            return;
        }
        replace(root ,0);
	}
    private static int replace(BinaryTreeNode<Integer> root ,int sum){
        if(root == null){
            return 0;
        }
        
        int right = replace(root.right ,sum);
        int rootdata = root.data;
        root.data = root.data + right + sum;
        int left = replace(root.left ,root.data);
        
        return rootdata + right + left;
    }
}