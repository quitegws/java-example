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
public class ConvertBSTToGreatTree {
    /**
     * @param root the root of binary tree
     * @return the new root
     */
    public TreeNode convertBST(TreeNode root) {
        // Write your code here
    	if (root == null) {
    		return null;
    	}
    	int sum = 0;
    	Stack stack = new Stack();
    	TreeNode root2 = root;
    	while (root != null || !stack.isEmpty()) {
    		while (root != null) {
    			stack.push(root);
    			root = root.left;
    		}
    		root = (TreeNode)stack.pop();
    		sum += root.val;
    		root = root.right;
    	}
    	root = root2;
    	stack.clear();
    	while (root != null || !stack.isEmpty()) {
    		while (root != null) {
    			stack.push(root);
    			root = root.left;
    		}
    		root = (TreeNode)stack.pop();
    		sum -= root.val;
    		root.val += sum;
    		root = root.right;
    	}
    	return root2;
    }
}