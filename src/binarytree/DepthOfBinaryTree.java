package binarytree;

public class DepthOfBinaryTree {

	//recursive
	public int minDepth(TreeNode root) {
		int depth = 0;
		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			return 1;
		} else if (root.left == null && root.right != null) {
			depth = minDepth(root.right) + 1;
		} else if (root.left != null && root.right == null) {
			depth = minDepth(root.left) + 1;
		} else {
			depth = Math.min(minDepth(root.left), minDepth(root.right)) + 1;
		}
		return depth;
	}
	//recursive
	public int maxDepth(TreeNode root) {
		int depth = 0;
		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			return 1;
		} else if (root.left == null && root.right != null) {
			depth = maxDepth(root.right) + 1;
		} else if (root.left != null && root.right == null) {
			depth = maxDepth(root.left) + 1;
		} else {
			depth = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
		}
		return depth;
	}
}
