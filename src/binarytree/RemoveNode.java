package binarytree;

import java.util.ArrayList;
import java.util.List;

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
public class RemoveNode {
    /**
     * @param root: The root of the binary search tree.
     * @param value: Remove the node with given value.
     * @return: The root of the binary search tree after removal.
     */
    public static TreeNode removeNode(TreeNode root, int value) {
        // write your code here
    	if (root == null) {
    		return null;
    	}
    	TreeNode tmp = root;
    	TreeNode parent = new TreeNode(0);
    	parent.left = root;
    	boolean isLeft = false;
    	while (root != null) {
    		if (root.val > value) {
    			parent = root;
    			root = root.left;
    			isLeft = true;
    		} else if (root.val < value) {
    			parent = root;
    			root = root.right;
    			isLeft = false;
    		} else {
    			break;
    		}
    	}
    	if (root == tmp) {
    		return deleteNode(root);
    	} else {
    		if (isLeft) {
    			parent.left = deleteNode(root);
    		} else {
    			parent.right = deleteNode(root);
    		}
    		
    		return tmp;
    	} 
    }
    
    public static TreeNode deleteNode(TreeNode root){
    	if (root == null) {
    		return null;
    	}
    	if (root.left == null) {
    		root = root.right;
    	} else if (root.right == null) {
    		root = root.left;
    	} else {
    		TreeNode parent = root;
    		TreeNode s = root.left;
    		while (s.right != null) {
    			parent = s;
    			s = s.right;
    		}
    		root.val = s.val;
    		if (parent == root) {
    			parent.left = s.left;
    		} else {
    			parent.right = s.left;
    		}
    	}
    	return root;
    }
    
    public static void main(String[] args){
    	String[] data = new String[]{"1","#","2", "#","3","#","4","#"};
    	TreeNode root = Utils.newTreeFromArray(data);
    	Utils.printTreePretty(root);
    	TreeNode node = removeNode(root, 4);
    	Utils.printTreePretty(node);
    	
//    	TreeNode tmp = new TreeNode(1);
//    	tmp.right = new TreeNode(2);
//    	tmp.right.right = new TreeNode(3);
//    	Utils.printTreePretty(tmp);
//    	tmp = tmp.right;
//    	Utils.printTreePretty(tmp);
    }
}