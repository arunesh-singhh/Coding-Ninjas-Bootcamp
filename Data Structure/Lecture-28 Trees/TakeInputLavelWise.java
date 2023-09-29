import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLavelWise extends PrintTreeImproved{
    public static TreeNode<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<TreeNode<Integer>>();
        // QueueUsingLL<TreeNode<Integer>> pendingNodes= new QueueUsingLL<>();
        System.out.println("Enter the root data ");
        int rootData= s.nextInt();
        if(rootData==-1)
            return null;

        TreeNode<Integer> root= new TreeNode<Integer>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> front= pendingNodes.remove();
            System.out.println("Enter no. of children "+ front.data);
            int numChild= s.nextInt();

            for(int i=0; i<numChild; i++){
                System.out.println("Enter the  "+i+" th child data"+ front.data);
                int childData= s.nextInt();
                TreeNode<Integer> childNode= new TreeNode<>(childData);
                front.children.add(childNode);
                pendingNodes.remove(childNode);
            }
        }
        return root;
    }

    public static void main(String[] args){
        TreeNode<Integer> root = takeInput();
        printTree(root);
    }
}
