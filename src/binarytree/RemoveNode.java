package binarytree;

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
    public TreeNode removeNode(TreeNode root, int value) {
        // write your code here
    	if (root == null) {
    		return null;
    	}
    	TreeNode root2 = root;
    	while (root != null) {
    		if (root.val > value) {
    			root = root.left;
    		} else if (root.val < value) {
    			root = root.right;
    		} else {
    			break;
    		}
    	}
    	if (root == root2) {
    		return deleteNode(root);
    	} else {
    		deleteNode(root);
    		return root2;
    	} 
    }
    
    public TreeNode deleteNode(TreeNode root){
    	if (root.left == null) {
    		root = root.right;
    		return root;
    	} else if (root.right == null) {
    		root = root.left;
    		return root;
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
    		return root;
    	}
    }
    
    public static void main(String[] args){
    	TreeNode root = new TreeNode(0);
    	root.right = new TreeNode(1);
    	root.left = new TreeNode(2);
    	TreeNode tmp = root;
    	tmp.left.val = 10;
    	System.out.println(root.left.val);
    }
}