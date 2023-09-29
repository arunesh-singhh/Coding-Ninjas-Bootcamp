package Assignment;

class LinkedListNode<T> { 
    T data; 
    LinkedListNode<T> next;
	public LinkedListNode(T data) { 
        this.data = data; 
    } 
}

class Pair{
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;
}

public class ConvertBSTtoLL {
    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root){
        return helper(root).head;
    }
    private static Pair helper(BinaryTreeNode<Integer> root){
        if(root==null){
            Pair ans = new Pair();
            return ans;
        }
        
        LinkedListNode<Integer> newNode = new LinkedListNode<>(root.data);
        Pair leftList = helper(root.left);
        Pair rightList=helper(root.right);

        if (leftList.tail != null) {
            leftList.tail.next = newNode;
        }
        newNode.next = rightList.head;

        Pair ans = new Pair();
        if (leftList.head != null) {
            ans.head = leftList.head;
        } 
        else {
            ans.head = newNode;
        }

        if (rightList.tail != null) {
            ans.tail = rightList.tail;
        } 
        else {
            ans.tail = newNode;
        }
        
        return ans;
    }
} 