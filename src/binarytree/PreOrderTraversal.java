package binarytree;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    ArrayList<Integer> result = new ArrayList<>();
    /**
     * Recursion Version
     * @param root: The root of binary tree.
     * @return: Preorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> preorderTraversal0(TreeNode root) {
        // write your code here
        if (root != null) {
            result.add((Integer)root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
        return result;
    }
    
    //Non-Recursion
    public ArrayList<Integer> preorderTraversal(TreeNode<Integer> root){
    	Stack<TreeNode<Integer>> stack = new Stack<>();
    	ArrayList<Integer> result = new ArrayList<>();
    	
    	if (root != null) {
    		stack.push(root);
    		
    		while (!stack.empty()) {
    			TreeNode<Integer> node = stack.pop();
    			result.add((Integer)node.val);
    			if (node.right != null) {
    				stack.push(node.right);
    			}
    			if (node.left != null) {
    				stack.push(node.left);
    			}
    		}
    	}
    	return result;
    	
    }

}
