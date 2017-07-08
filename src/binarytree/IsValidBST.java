package binarytree;

import java.util.ArrayList;

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class IsValidBST {
    /**
     * @param root: The root of binary tree.
     * @return: True if the binary tree is BST, or false
     */
    public boolean isValidBST(TreeNode root) {
        // write your code here
    	if (root == null ) {
    		return true;
    	}
    	if (root.left != null) {
    		if (root.left.val >= root.val) {
    			return false;
    		}
    		if (!isValidBST(root.left)) {
    			return false;
    		}
    	}
    	if (root.right != null) {
    		if (root.right.val <= root.val) {
    			return false;
    		}
    		if (!isValidBST(root.right)) {
    			return false;
    		}
    	}
    	return true;
    	
    }
    
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(1);
    	TreeNode right1 = new TreeNode(2);
    	TreeNode right21 = new TreeNode(3);
    	root.right = right1;
    	right1.left = right21;

    	System.out.println(new IsValidBST().isValidBST(root));
    }
    
}