package Assignment;

// import java.util.LinkedList;
// import java.util.Queue;

public class ReplaceNodeWithDepth {
    // static int a=0;
	// public static void replaceWithDepthValue(TreeNode<Integer> root){

	// 	Queue<TreeNode<Integer>> queue = new LinkedList<>();
    //     queue.add(root);
    //     queue.add(null);

    //     while(!queue.isEmpty()) {    
    //         TreeNode<Integer> frontNode = queue.remove();
            
    //         if(frontNode == null){
    //             if(queue.isEmpty()) {
    //                 break;
    //             }
    //             a++;
    //             queue.add(null);
    //         }
    //         else {
    //             frontNode.data=a;
    //             for(int i=0;i<frontNode.children.size();i++){
    //                 queue.add(frontNode.children.get(i));
    //             } 
    //         }
    //     }
	// }	

    
    public static void replaceWithDepthValue(TreeNode<Integer> root){
        if(root == null){
            return;
        }
        replaceWithDepthValue(root,0);
    }
        
    public static void replaceWithDepthValue(TreeNode<Integer> root, int depth){
        root.data = depth;
        for(TreeNode<Integer> child : root.children){
            replaceWithDepthValue(child, depth + 1);
        }
    }
}
