class IsBSTReturn{
    int min;
    int max;
    boolean isBST;

    public IsBSTReturn(int min, int max, boolean isBST){
        this.min= min;
        this.max= max;
        this.isBST= isBST;
    }
}
class BSTDeleteReturn {
    BinaryTreeNode<Integer> root;
    boolean  deleted;

    BSTDeleteReturn(BinaryTreeNode<Integer> root, boolean deleted){
        this.root = root;
        this.deleted = deleted;
    }
}

public class CreatBSTclass {
    private BinaryTreeNode<Integer> root;
    private int size;
    
    // Check element ispresent or not
    public boolean isPresent(int x){
        return isPresentHelper(root, x);
    }
    public static boolean isPresentHelper(BinaryTreeNode<Integer> node, int x){
        if(node==null){
            return false;
        }
        if(node.data==x){
            return true;
        }
        if(x<node.data){
            return isPresentHelper(node.left,x);
        }else{
            return isPresentHelper(node.right, x);
        }
    }
    
    // delete node
    public boolean deleteData(int x){
        BSTDeleteReturn ans = deleteDataHelper(root, x);
        if (ans.deleted) {
            size--;
        }
        return ans.deleted;
    }
    private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x){
        if(root==null)
            return new BSTDeleteReturn(null, false);
        if(root.data < x){
            BSTDeleteReturn outputRight = deleteDataHelper(root.right,x);
            root.right = outputRight.root;
            outputRight.root = root;
            return outputRight;
        }
        if(root.data>x){
            BSTDeleteReturn outputLeft= deleteDataHelper(root.left,x);
            root.left=outputLeft.root;
            outputLeft.root= root;
            return outputLeft;
        }
        //0 children
        if(root.left == null && root.right==null){
            return new BSTDeleteReturn(null, true);
        }
        //only left child
        if(root.left != null && root.right==null){
            return new BSTDeleteReturn(root.left, true);
        }
        //only right child
        if(root.left == null && root.right!=null){
            return new BSTDeleteReturn(root.right, true);
        }
        //both children present
        int rightMin =  minimum(root.right);
        root.data= rightMin;
        BSTDeleteReturn outputRight= deleteDataHelper(root.right, rightMin);
        root.right= outputRight.root;
        return new BSTDeleteReturn(root, true);
    }
    private static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.left == null) {
            return root.data;
        }
        return minimum(root.left);
    }

    // insert node in BST
    public BinaryTreeNode<Integer> insert(int x){
        root = insertHelper(root, x);
        size++;
        return root;
    }
    private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int x){
        if (root == null) {
            BinaryTreeNode<Integer> newroot = new BinaryTreeNode<Integer>(x);
            return newroot;
        }
        if (root.data <= x) {
            root.right = insertHelper(root.right, x);
        }
        else{
            root.left = insertHelper(root.left, x);
        }
        return root;
    }

    // return size of BST
    public int size(){
        return size;
    }

    // print BST
    public void printTree(){
        printTreeHelper(root);
    }
    private void printTreeHelper(BinaryTreeNode<Integer> node){
        if(node == null){
            return;
        }
        System.out.print(node.data+":");
        if(node.left != null){
            System.out.print("L"+node.left.data+", ");
        }
        if(node.right != null){
            System.out.print("R"+node.right.data);
        }
        System.out.println();

        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }

    public static void main(String[] args){

        CreatBSTclass b= new CreatBSTclass();
        b.insert(5);
        b.insert(2);
        b.insert(7);
        b.insert(1);
        b.insert(3);
        b.insert(6);
        b.insert(8);

        b.printTree();

        System.out.println(b.isPresent(5));
        b.deleteData(5);
        System.out.println(b.isPresent(5));

        b.printTree();
        b.deleteData(2);
        System.out.println(b.isPresent(2));
        b.printTree();
        System.out.println(b.size());
    }

}
