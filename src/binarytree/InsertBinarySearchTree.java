package binarytree;

// class TreeNode {
//      public int val;
//      public TreeNode left, right;
//      public TreeNode(int val) {
//          this.val = val;
//          this.left = this.right = null;
//      }
//}

public class InsertBinarySearchTree {
    /**
     * @param root: The root of the binary search tree.
     * @param node: insert this node into the binary search tree
     * @return: The root of the new binary search tree.
     */
    public static TreeNode insertNode(TreeNode root, TreeNode node) {
        // write your code here
    	if (root == null || node == null) {
    		return null;
    	}
    	if (root.val.compareTo(node.val) <= 0) {
    		if (root.right == null) {
    			root.right = node;
    			return root;
    		}
    		insertNode(root.right, node);
    	} else {
    		if (root.left == null) {
    			root.left = node;
    			return root;
    		}
    		insertNode(root.left, node);
    	}
    	return root;
    }
    
    public static TreeNode<Integer> insertNode2(TreeNode<Integer> root, TreeNode<Integer> node){
    	if (root == null) {
    		return node;
    	}
    	TreeNode<Integer> current = root;
    	
    	while (current != null) {
    		if (current.val == node.val) {
    			return root;
    		} else if (current.val < node.val) {
    			if (current.right == null) {
    				current.right = node;
    				return root;
    			} else {
    				current = current.right;
    			}
    		} else if (current.val > node.val) {
    			if (current.left == null) {
    				current.left = node;
    				return root;
    			} else {
    				current = current.left;
    			}
    		}
    	}
    	return root;
    }
    
    public static void main(String[] args){
    	TreeNode root = new TreeNode(2);
    	TreeNode left1 = new TreeNode(1);
    	TreeNode right1 = new TreeNode(4);
    	TreeNode right21 = new TreeNode(3);
    	TreeNode right22 = new TreeNode(5);
    	root.left = left1;
    	root.right = right1;
    	right1.left = right21;
    	right1.right = right22;
    	
    	
    	Utils.printTreePretty(root);
    	TreeNode node = new TreeNode(0);
    	Utils.printTreePretty(insertNode(root, node));
    	
    	
    }
    
}
//class TreeNode<T> {
//	  
//    public T val;
//    public TreeNode<T> left, right;
//    public TreeNode(T val) {
//        this.val = val;
//        this.left = this.right = null;
//    }
//}