import java.util.ArrayList;

class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
        this.left = null;
        this.right = null;
	}
}

public class MergeTwoBSTs {
    
    // for printing the BST
    private static void printBST(BinaryTreeNode<Integer> root){
        if ( root == null) {
            return;
        }
        printBST(root.left);
        System.out.print(root.data + " ");
        printBST(root.right);
    }


    // convert BST to ArrayList
    private static void convertBSTtoArrayList(BinaryTreeNode<Integer> root, ArrayList<Integer> arr){
        if (root != null) {
            convertBSTtoArrayList(root.left, arr);
            arr.add(root.data);
            convertBSTtoArrayList(root.right, arr);
        }
    }


    // Method that merges two ArrayLists into one.
    private static ArrayList<Integer> addTwoArrayList(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        int m = arr1.size();
        int n = arr2.size();
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0, j = 0;
        while(i < m && j < n) {
            if (arr1.get(i) < arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
            }
            else{
                arr.add(arr2.get(j));
                j++;
            }
        }

        while (i < m) {
            arr.add(arr1.get(i));
            i++;
        }
        while (j < n) {
            arr.add(arr2.get(j));
            j++;
        }
        return arr;
    }


    // Method that convert ArrayList to BST
    private static BinaryTreeNode<Integer> convertArrayListToBST(ArrayList<Integer> arr, int start, int end){
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(arr.get(mid));

        node.left = convertArrayListToBST(arr, start, mid - 1);
        node.right = convertArrayListToBST(arr, mid + 1, end);

        return node;

    }


    static void printMergeTrees(BinaryTreeNode<Integer> root1, BinaryTreeNode<Integer> root2) {
		ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        convertBSTtoArrayList(root1, arr1);
        convertBSTtoArrayList(root2, arr2);

        ArrayList<Integer> arr = addTwoArrayList(arr1, arr2);
        BinaryTreeNode<Integer> root = convertArrayListToBST(arr, 0, arr.size() - 1);
        printBST(root);
	}
}
