package binarytree;
import java.util.Scanner;

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
public class InvertBinaryTree {
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
    	if (root == null) {
    		return;
    	}
    	TreeNode tmp = root.left;
    	root.left = root.right;
    	root.right = tmp;
    	
    	invertBinaryTree(root.left);
    	invertBinaryTree(root.right);
    }
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    }

}

