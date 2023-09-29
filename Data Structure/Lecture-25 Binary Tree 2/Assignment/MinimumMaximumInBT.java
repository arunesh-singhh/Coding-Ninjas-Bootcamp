package Assignment;

class Pair<T, U> {
	T minimum;
	U maximum;

	public Pair(T minimum, U maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

}

public class MinimumMaximumInBT {

    // public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {

	// 	int min = Integer.MAX_VALUE;
    //  int max = -1;

    //  Pair<Integer, Integer> ans = new Pair<Integer, Integer>(min, max);
	// 	getMinAndMaxHelper(root, ans);
	// 	return ans;
	// }

	// private static void getMinAndMaxHelper(BinaryTreeNode<Integer> root,  Pair<Integer, Integer> ans) {
	// 	if (root == null) {
    //         return;
    //     }

    //     if (ans.minimum > root.data) {
	// 	   ans.minimum = root.data;
    //     }
    //     if (ans.maximum < root.data) {
	// 		ans.maximum = root.data;
    //     }

	// 	getMinAndMaxHelper(root.left, ans);
    //     getMinAndMaxHelper(root.right, ans);
	// }

    public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
       
        if (root == null) {
            return new Pair<>(Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
       
        Pair<Integer, Integer> leftPair = getMinAndMax(root.left);
        Pair<Integer, Integer> rightPair = getMinAndMax(root.right);
        
        int minimum = Math.min(root.data, Math.min(leftPair.minimum, rightPair.minimum));
        int maximum = Math.max(root.data, Math.max(leftPair.maximum, rightPair.maximum));

        return new Pair<>(minimum, maximum);
    }
}
