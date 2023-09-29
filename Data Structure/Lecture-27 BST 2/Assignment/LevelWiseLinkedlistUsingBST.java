package Assignment;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//LinkedListNode Class
class LinkedListNode<T> { 
 	T data; 
	LinkedListNode<T> next;
	public LinkedListNode(T data){
	    this.data = data; 
	} 
}


// public class LevelWiseLinkedlistUsingBST {

// 	private static ArrayList<LinkedListNode<Integer>> arr = new ArrayList<LinkedListNode<Integer>>();

// 	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
//         if (root==null)
//             return null;
        
//         Queue<BinaryTreeNode<Integer>> nodesToPrint = new LinkedList<BinaryTreeNode<Integer>>();
//         nodesToPrint.add(root);
//         nodesToPrint.add(null);
//         LinkedListNode<Integer> head = null,tail=null;

//         //arr.add(head);
//         while(!nodesToPrint.isEmpty()){
//             BinaryTreeNode<Integer> front = nodesToPrint.poll();
//             if (front==null){
//                 if (nodesToPrint.isEmpty())
//                     break;
//                 else{
//                     //System.out.println();
//                 	nodesToPrint.add(null);
//                     tail.next=null;
//                     tail=tail.next;
//                     head=null;
//                 } 
//             }
//             else{
//                 if (head==null){
//                     head = new LinkedListNode<Integer>(front.data);
//                     tail=head;
//                     arr.add(head);
//                 }
//                 else{
//                     tail.next=new LinkedListNode<Integer>(front.data);
//                     tail=tail.next;
//                 }
//                 //System.out.print(front.data+" ");
//                 if (front.left!=null)
//                     nodesToPrint.add(front.left);
//                 if (front.right!=null)
//                     nodesToPrint.add(front.right);
//             }
//         }
//         return arr;
// 	}

// }



/*
Time complexity: O(N)
Space complexity: O(H)
where N is the number of nodes in the input BST
and H is the height of the input BST
*/
public class LevelWiseLinkedlistUsingBST {
    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        if (root == null) {
            return null;
        }
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<BinaryTreeNode<Integer>>();
        pendingNodes.add(root);
        int currentLevelRemaining = 1;
        int nextLevelCount = 0;
        
        LinkedListNode<Integer> currentLevelHead = null;
        LinkedListNode<Integer> currentLevelTail = null;
        ArrayList<LinkedListNode<Integer>> output = new ArrayList<>();
        
        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> currentNode;
            currentNode = pendingNodes.remove();
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(currentNode.data);
            
            if (currentLevelHead == null) {
                currentLevelHead = newNode;
                currentLevelTail = newNode;
            }
            else {
                currentLevelTail.next = newNode;
                currentLevelTail = newNode;
            }
            if (currentNode.left != null) {
                pendingNodes.add(currentNode.left);
                nextLevelCount++;
            }
            if (currentNode.right != null) {
                pendingNodes.add(currentNode.right);
                nextLevelCount++;
            }
            currentLevelRemaining--;
            if (currentLevelRemaining == 0) {
                output.add(currentLevelHead);
                currentLevelHead = null;
                currentLevelTail = null;
                currentLevelRemaining =
                nextLevelCount;
                nextLevelCount=0;
            }
        }
        return output;
    }
}