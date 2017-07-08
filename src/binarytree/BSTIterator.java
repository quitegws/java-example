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
 * Example of iterate a tree:
 * BSTIterator iterator = new BSTIterator(root);
 * while (iterator.hasNext()) {
 *    TreeNode node = iterator.next();
 *    do something for node
 * } 
 */
public class BSTIterator {
	Stack stack = new Stack();
	TreeNode next = null;
    public BSTIterator(TreeNode root) {
    	next = root;
    }

    //@return: True if there has next node, or false
    public boolean hasNext() {
    	if (next != null) {
    		while (next != null) {
    			stack.push(next);
    			next = next.left;
    		}
    		next = null;
    	}
    	return !stack.isEmpty();
    }
    
    //@return: return next node
    public TreeNode next() {
        if (!hasNext()) {
        	return null;
        } else {
        	TreeNode tmp = (TreeNode)stack.pop();
        	next = tmp.right;
        	return tmp;
        }
    }
}