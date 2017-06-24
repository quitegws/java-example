package binarytree;

import java.util.ArrayList;
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
public class InOrderTraversal {
    /**Recursion
     * @param root: The root of binary tree.
     * @return: Inorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // write your code here
    	ArrayList<Integer> result = new ArrayList<>();
    	if (root != null) {
    		inorderTraversal(root.left);
    		result.add((Integer)root.val);
    		inorderTraversal(root.right);
    	}
    	return result;
    }
    
    //Non-Recursion
    public ArrayList<Integer> inorderTraversal2(TreeNode root) {
        // write your code here
    	Stack<TreeNode> stack = new Stack<>();
    	ArrayList<Integer> list = new ArrayList<>();
    	if (root == null) {
    		return list;
    	}
    	TreeNode curt = root;
    	while (curt != null || !stack.empty()) {
    		while (curt != null) {
    			stack.push(curt);
    			curt = curt.left;
    		}
    		curt = stack.pop();
    		list.add((Integer)curt.val);
    		curt = curt.right;
    	}
    	return list;
    }
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    }
}