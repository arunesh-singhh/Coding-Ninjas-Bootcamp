// createBinaryTree

public class createBinaryTree extends printBinaryTree {   // extends printBinryTree class to access printTree function
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer> (1);

        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer> (2);
        BinaryTreeNode<Integer> rootright = new BinaryTreeNode<Integer> (3);
        root.left = rootLeft;
        root.right = rootright;
        
        BinaryTreeNode<Integer> rootLeftsRight = new BinaryTreeNode<Integer> (4);
        BinaryTreeNode<Integer> rootRightsLeft = new BinaryTreeNode<Integer> (5);
        rootLeft.right = rootLeftsRight;
        rootright.left = rootRightsLeft;

        printTree(root);      // call printTree function which is inside the printBinaryTree class
        printTreeDetailed(root);
    }
}


// // second way(everything is in same class)

// // Lets Create class to define the Structure of the Binarytree.
// class BinaryTreeNode<T> {        
//     T data;
//     BinaryTreeNode<T> left;
//     BinaryTreeNode<T> right;

//     public BinaryTreeNode(T data){   // Lets create defult constructor.
//         this.data = data;
//     }
// }

// public class createBinaryTree {

//     static void printTree(BinaryTreeNode<Integer>root){
//         if(root == null){
//             return;
//         }
//         System.out.println(root.data);
//         printTree(root.left);
//         printTree(root.right);
//     }

//     public static void main(String[] args) {
//         BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer> (1);

//         BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer> (2);
//         BinaryTreeNode<Integer> rootright = new BinaryTreeNode<Integer> (3);
//         root.left = rootLeft;
//         root.right = rootright;
        
//         BinaryTreeNode<Integer> rootLeftsRight = new BinaryTreeNode<Integer> (4);
//         BinaryTreeNode<Integer> rootRightsLeft = new BinaryTreeNode<Integer> (5);
//         rootLeft.right = rootLeftsRight;
//         rootright.left = rootRightsLeft;

//         printTree(root);    // call printTree function
//         printTreeDetailed(root);
//     }
// }