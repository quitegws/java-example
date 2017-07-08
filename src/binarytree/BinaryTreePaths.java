package binarytree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
public class BinaryTreePaths {
    /**
     * @param root the root of the binary tree
     * @return all root-to-leaf paths
     */
    public List<String> binaryTreePaths2(TreeNode root) {
        // Write your code here
    	List<String> list = new ArrayList<>();
    	if (root == null) {
    		return list;
    	}
    	Stack<TreeNode> stack = new Stack<>();
    	stack.add(root);
    	
    	while (!stack.empty() || root != null) {
    		StringBuilder sb = new StringBuilder();
    		while (!stack.empty()) {
    			root = stack.pop();
    			sb.append(root.val + "->");
    			stack.add(root.left);
    		}
    		list.add(sb.toString());
    		
    	}
    	
    }
    
    public static List<String> binaryTreePaths(TreeNode root){
    	List<String> list = new ArrayList<>();
    	if (root == null) {
    		return list;
    	}
    	int rootval = (int)root.val;
    	if (root.left != null) {
    		List<String> leftPaths = binaryTreePaths(root.left);
    		for (String s : leftPaths) {
    			list.add(rootval + "->" + s);
    		}
    		
    	}
    	if (root.right != null) {
    		
    		List<String> rightPaths = binaryTreePaths(root.right);
    		for (String s : rightPaths) {
    			list.add(rootval + "->" + s);
    		}
    	}
    	if (root.left == null && root.right == null) {
    		list.add(String.valueOf(rootval));
    	}
    	return list;
    }
    
    public List<List<Integer>> binaryTreePathSum(TreeNode root, int target) {
        // Write your code here
    	List<List<Integer>> result = new ArrayList<>();
    	if (root == null) {
    		return result;
    	}
    	int rootVal = (int) root.val;
    	if (root.right == null && root.left == null) {
    		if (target == rootVal) {
    			List<Integer> list = new ArrayList<>();
    			list.add((int)root.val);
    			result.add(list);
    		} else {
    			return result;
    		}
    	}
    	if (root.left != null) {
    		List<List<Integer>> leftPathSum = binaryTreePathSum(root.left, target - rootVal);
    		for (List<Integer> list : leftPathSum) {
    			list.add(rootVal);
    			result.add(list);
    		}
    	}
    	if (root.right != null) {
    		List<List<Integer>> rightPathSum = binaryTreePathSum(root.right, target - rootVal);
    		for (List<Integer> list : rightPathSum) {
    			list.add(rootVal);
    			result.add(list);
    		}
    	}
    	return result;
    }
    
    
    public static void main(String[] args) {
    	int len = 100;
    	List<Character> list = new ArrayList<>();
    	for (int i = 0; i < len; i++) {
    		list.add((char)(i+'a'));
    	}
    	
    	TreeNode root = Utils.NewTree(list);
    	Utils.printTreePretty(root);
    }
}