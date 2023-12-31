package Assignment;

public class PostOrderTraversal {
    public static void printPostOrder(TreeNode<Integer> root){
		if(root.children.size()==0){
            System.out.print(root.data+" ");
        	return;
        }
        for(TreeNode<Integer> child:root.children){
            printPostOrder(child);
        }
        System.out.print(root.data+" ");
	}

}
