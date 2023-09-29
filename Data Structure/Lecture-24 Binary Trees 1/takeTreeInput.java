// // uncomment all ( ctrl+a then ctrl+/)

// import java.util.Scanner;

// // Lets Create class to define the Structure of the Binarytree.
// class BinaryTreeNode<T> {        
//     T data;
//     BinaryTreeNode<T> left;
//     BinaryTreeNode<T> right;

//     public BinaryTreeNode(T data){   // Lets create defult constructor.
//         this.data = data;
//     }
// }


// public class takeTreeInput extends printBinaryTree {

//     public static BinaryTreeNode<Integer> inputTree(){
//         System.out.println("Enter root node: ");
//         Scanner s = new Scanner(System.in);
//         int rootData = s.nextInt();
        

//         if (rootData == -1) {
//             return null;
//         }
//         BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
//         BinaryTreeNode<Integer> leftChild = inputTree();
//         BinaryTreeNode<Integer> rightChild = inputTree();
//         root.left = leftChild;
//         root.right = rightChild;

//         return root;
//     }


//     public static void main(String[] args) {
//         BinaryTreeNode<Integer> root = inputTree();

//         printTreeDetailed(root);
//     }
// }
