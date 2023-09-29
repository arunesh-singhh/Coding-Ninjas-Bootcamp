package Assignment;

// import java.util.LinkedList;
// import java.util.Queue;


// public class SecondLargestElementInTree {
//     public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
//         if(root.children.size() == 0){
//               return null;
//           }
//         Queue<TreeNode<Integer>> queue = new LinkedList<>();
//         TreeNode<Integer> fl=root,sl=null;
//         int data = Integer.MIN_VALUE;
//         queue.add(root);

//         while(!queue.isEmpty()) {
//             TreeNode<Integer> frontNode = queue.poll();
//             for(int i=0;i<frontNode.children.size();i++){
//                 queue.add(frontNode.children.get(i));
//             }
            
//             if(frontNode.data >  data){
//                 if(frontNode.data > fl.data){
//                     sl = fl;
//                     data = fl.data;
//                     fl = frontNode;
//                 }
//                 else if (frontNode.data < fl.data){
//                     sl = frontNode;
//                     data = sl.data;
//                 }
//             }
//         }
//         return sl;
//     }
// }
	


public class SecondLargestElementInTree {

    static class Pair<T>{
        T first;
        T second;
        Pair(T first, T second){
            this.first = first;
            this.second = second;
        }
    }

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        return findSecondLargestHelper(root).second;
    }

    public static Pair<TreeNode<Integer>> findSecondLargestHelper(TreeNode<Integer> root){
        Pair<TreeNode<Integer>> output;
        if(root == null){
            output = new Pair<TreeNode<Integer>>(null,null);
            return output;
        }
        output = new Pair<TreeNode<Integer>>(root, null);
        for(TreeNode<Integer> child : root.children){
            Pair<TreeNode<Integer>> childPair = findSecondLargestHelper(child);
            if(childPair.first.data > output.first.data){
                if(childPair.second == null || childPair.second.data < output.first.data){
                    output.second = output.first;
                    output.first = childPair.first;
                }
                else{
                    output.first = childPair.first;
                    output.second = childPair.second;
                }
            } 
            else if(childPair.first.data.equals(output.first.data) && childPair.second != null) {
                if(output.second == null || childPair.second.data>output.second.data){
                    output.second = childPair.second;
                }
            } 
            else if(output.first.data != childPair.first.data && (output.second == null ||childPair.first.data > output.second.data)) {
                output.second = childPair.first;
            }
        }
        return output;
    }
}
