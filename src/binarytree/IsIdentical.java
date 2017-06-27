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
public class IsIdentical {
    /**
     * @param a, b, the root of binary trees.
     * @return true if they are identical, or false.
     */
    public boolean isIdentical(TreeNode a, TreeNode b) {
        // Write your code here
    	if (a == null && b != null) {
    		return false;
    	}
    	
    	if (a != null && b == null) {
    		return false;
    	}
    	
    	Stack<TreeNode> stack = new Stack<>();
    	stack.add(a);
    	stack.add(b);
    	
    	while (a != null || b != null || !stack.empty()) {
    		while (a != null && b != null) {
    			b = stack.pop();
    			a = stack.pop();
    			int aval = (int) a.val;
    			int bval = (int) b.val;
    			if (aval != bval) {
    				return false;
    			}
    			a = a.left;
    			b = b.left;
    			stack.add(a);
    			stack.add(b);
    		}
    		
    		
    	}
    	
    	return true;
    }
    
    public boolean isIndentical (TreeNode a, TreeNode b) {
    	if (a == null && b == null) {
    		return true;
    	}
    	if (a == null && b != null) {
    		return false;
    	}
    	
    	if (a != null && b == null) {
    		return false;
    	}
    	
    	if (a.val != b.val) {
    		return false;
    	}
    	if (!isIndentical(a.left, b.left) || !isIndentical(a.right, b.right)) {
    		return false;
    	}
    	return true;
    }
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    }
}