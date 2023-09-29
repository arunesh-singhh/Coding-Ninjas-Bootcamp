import java.util.Scanner;

public class TakeInputTree extends PrintTreeImproved {
    public static TreeNode<Integer> takeInput(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the root data ");
        int rootData= s.nextInt();
        if(rootData==-1){
            s.close();
            return null;
        }
        TreeNode<Integer> root= new TreeNode<Integer>(rootData);
        root = takeInput(root);
        s.close();
        return root;
    }

    private static TreeNode<Integer> takeInput(TreeNode<Integer> root){
        Scanner s= new Scanner(System.in);

        System.out.println("Enter no. of childrens of "+ root.data);
        int numChild = s.nextInt();

        for(int i=1; i <= numChild; i++){
            System.out.println("Enter the  "+i+" th child data"+ root.data);
            int childData = s.nextInt();
            TreeNode<Integer> childNode= new TreeNode<>(childData);
            root.children.add(childNode);
            takeInput(childNode);
        }
        return root;
    }

    public static void main(String[] args){
        TreeNode<Integer> root = takeInput();
        printTree(root);
    }
}
