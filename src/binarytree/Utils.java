package binarytree;

public class Utils {
	public static TreeNode cloneNode(TreeNode node) {
		if (node == null) {
			return null;
		} else {
			TreeNode clone = new TreeNode(node.val);
			clone.left = node.left;
			clone.right = node.right;
			return clone;
		}	
	}
	public static TreeNode NewTree(){
		
	}
}
