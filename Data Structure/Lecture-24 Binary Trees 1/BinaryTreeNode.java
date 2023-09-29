// Lets Create class to define the Structure of the Binarytree.

public class BinaryTreeNode<T> {        
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data){   // Lets create defult constructor.
        this.data = data;
    }
}
