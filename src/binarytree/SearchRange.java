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
public class SearchRange {
    /**
     * @param root: The root of the binary search tree.
     * @param k1 and k2: range k1 to k2.
     * @return: Return all keys that k1<=key<=k2 in ascending order.
     */
    public ArrayList<Integer> searchRange(TreeNode root, int k1, int k2) {
        // write your code here
    	ArrayList<Integer> result = new ArrayList<>();
    	if (root == null || k1 > k2) {
    		return result;
    	}
    	TreeNode current = root;
    	while (current != null) {
    		if (current.val < k1) {
    			current = current.right;
    		} else if (current.val > k2) {
    			current = current.left;
    		} else {
    			break;
    		}
    	}
    	
    	if (current == null) {
    		return result;
    	}
    	
    	TreeNode tmp = current;
    	
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while (tmp != null || !stack.empty()) {
    		while (tmp != null) {
    			stack.push(tmp);
    			tmp = tmp.left;
    		}
    		tmp = stack.pop();
    		if (tmp.val >= k1 && tmp.val <= k2) {
    			result.add((Integer)tmp.val);
    		}
    		
    		tmp = tmp.right;
    	}
    	
    	
    	return result;
    }
    
    public static void main(String[] args) {
    	TreeNode root = new TreeNode(20);
    	TreeNode left1 = new TreeNode(8);
    	TreeNode right1 = new TreeNode(22);
    	TreeNode right21 = new TreeNode(4);
    	TreeNode right22 = new TreeNode(12);
    	root.left = left1;
    	root.right = right1;
    	left1.left = right21;
    	left1.right = right22;
    	
    	ArrayList list = new SearchRange().searchRange(root, 10, 22);
    	utils.PrintUtils.printList(list);
    	
    }
}



//class TreeNode {
//
//	public int val;
//	public TreeNode left, right;
//	
//	public TreeNode(int val) {
//		this.val = val;
//		this.left = this.right = null;
//	}
//}