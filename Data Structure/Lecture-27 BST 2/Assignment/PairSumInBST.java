package Assignment;

// import java.util.ArrayList;
// import java.util.Collections;

// public class PairSumInBST {
//     public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
//         if (root==null)
//             return;
//         else{
//             ArrayList<Integer> arr = convertToArray(root);
//         	Collections.sort(arr);
//         	printPairSum(arr,s);
//         }
        
// 	}
    
//     private static ArrayList<Integer> convertToArray(BinaryTreeNode<Integer> root){
//         if (root==null){
//             ArrayList<Integer> arr = new ArrayList<Integer>();
//             return arr;
//         }
        
//         ArrayList<Integer> currArr = new ArrayList<Integer>();
//         ArrayList<Integer> leftArr = convertToArray(root.left);
//         if (!leftArr.isEmpty()) {
//             currArr.addAll(leftArr);
//         }
        
//         currArr.add(root.data);
        
//         ArrayList<Integer> rightArr = convertToArray(root.right);
//         if (!rightArr.isEmpty()) {
//             currArr.addAll(rightArr);
//         }
//         return currArr;
//     }
    
//     private static void printPairSum(ArrayList<Integer> arr, int s) {
//         int i=0,j=arr.size()-1;

//         while(i<j) {
//             int val1=arr.get(i);
//             int val2=arr.get(j);
//             if (val1+val2>s){
//                 j=j-1;
//             }
//             else if(val1+val2<s){
//                 i=i+1;
//             }
//             else{
//                 System.out.println(val1+" "+val2);
//                 i=i+1;
//                 j=j-1;
//             }     
//         }
//     }
// }




/*
Time complexity: O(N)
Space complexity: O(H)
where N is the number of nodes in the input BST
and H is the height of the input BST
*/
import java.util.Stack;

public class PairSumInBST {
    public static int countNodes(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) +
        countNodes(root.right) + 1;
        }
    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        if (root == null) {
            return;
        }
        int totalCount = countNodes(root);
        int count = 0;
        Stack<BinaryTreeNode<Integer>> inorder = new Stack<BinaryTreeNode<Integer>>();
        Stack<BinaryTreeNode<Integer>> revInorder = new Stack<BinaryTreeNode<Integer>>();
        BinaryTreeNode<Integer> temp = root;
        while (temp != null) {
            inorder.push(temp);
            temp = temp.left;
        }
        temp = root;
        while (temp != null) {
            revInorder.push(temp);
            temp = temp.right;
        }
        while (count < totalCount - 1) {
            BinaryTreeNode<Integer> top1 = inorder.peek();
            BinaryTreeNode<Integer> top2 = revInorder.peek();
            if (top1.data + top2.data == s) {
                System.out.println(top1.data + " " + top2.data);
                BinaryTreeNode<Integer> top = top1;
                inorder.pop();
                count++;
                if (top.right != null) {
                    top = top.right;
                    while (top != null){
                        inorder.push(top);
                        top = top.left;
                    }
                }
                top = top2;
                revInorder.pop();
                count++;
                if (top.left != null) {
                    top = top.left;
                    while (top != null){
                        revInorder.push(top);
                        top = top.right;
                    }
                }
            } 
            else if (top1.data + top2.data > s) {
                BinaryTreeNode<Integer> top = top2;
                revInorder.pop();
                count++;
                if (top.left != null) {
                    top = top.left;
                    while (top != null){
                        revInorder.push(top);
                        top = top.right;
                    }
                }
            } 
            else {
                BinaryTreeNode<Integer> top = top1;
                inorder.pop();
                count++;
                if (top.right != null) {
                    top = top.right;
                    while (top != null){
                        inorder.push(top);
                        top = top.left;
                    }
                }
            }
        }
    }
}