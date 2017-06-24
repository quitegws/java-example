package binarytree;

import java.util.Stack;

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
public class CloneTree {
	
    /**
     * @param root: The root of binary tree
     * @return root of new tree
     */
    public TreeNode cloneTree(TreeNode root){
    	if (root == null) {
    		return null;
    	}
    	TreeNode cloneRoot = new TreeNode(root.val);
    	cloneRoot.left = cloneTree(root.left);
    	cloneRoot.right = cloneTree(root.right);
    	return cloneRoot;
    }
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    }
}