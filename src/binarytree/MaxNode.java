package binarytree;

import java.util.Stack;

public class MaxNode {
    /**
     * @param root the root of binary tree
     * @return the max ndoe
     */
    public TreeNode maxNode(TreeNode root) {
        // Write your code here
    	if (root == null) {
    		return null;
    	}
    	
    	TreeNode maxNode = new TreeNode(Integer.MIN_VALUE);
    	
    	Stack stack = new Stack();
    	
    	while (root != null || !stack.isEmpty()) {
    		while (root != null) {
    			stack.push(root);
    			root = root.left;
    		}
    		root = (TreeNode)stack.pop();
    		if (root != null && maxNode.val < root.val) {
    			maxNode = root;
    		}
    		root = root.right;
    		
    	}
    	return maxNode;
    }
    
    public static void main(String[] args) {
    	TreeNode root = Utils.newTreeFromArray(new int[]{1,2,3,4,5,6,7});
    	Utils.printTreePretty(root);
    	Utils.echo(new MaxNode().maxNode(root).val + "======");
        maxNode22(root);
    	System.out.println(max);
    }

    public static void maxNode22(TreeNode root){

    	if (root != null) {
    		max = Math.max(root.val , max);
    		maxNode22(root.left);
    		maxNode22(root.right);
		}
	}

	public static int max = 0;
}