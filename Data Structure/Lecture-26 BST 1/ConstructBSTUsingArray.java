public class ConstructBSTUsingArray {
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return SortedArrayToBST(arr,0, n-1);}
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int si,int ei){
       
        if(si>ei){
            return null;
        }
        int midIndex=(ei+si)/2;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[midIndex]);
     
        root.left=SortedArrayToBST(arr,si,midIndex-1);
        root.right=SortedArrayToBST(arr,midIndex+1,ei);
        
        return root;
    }
}
