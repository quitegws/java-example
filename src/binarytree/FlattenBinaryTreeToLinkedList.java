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
public class FlattenBinaryTreeToLinkedList {
	static TreeNode lastNode = null;
    /**
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public  static void flatten(TreeNode root) {
        // write your code here
    	if (root == null) {
    		return ;
    	}
    	if (lastNode != null) {
    		lastNode.left = null;
    		lastNode.right = root;
    	}
    	
    	TreeNode left = root.left;
    	TreeNode right = root.right;
    	
    	root.left = null;
    	lastNode = root;
    	flatten(left);
    	flatten(right);
    	
    }
    

    

    public static void main(String[] args){
    	TreeNode root = Utils.newTreeFromArray(new int[]{1,2});
    	Utils.printTreePretty(root);
//    	flatten(root);

		FlattenBinaryTreeToLinkedList flattenBinaryTreeToLinkedList = new FlattenBinaryTreeToLinkedList();

		flattenBinaryTreeToLinkedList.flattens(root);
    	Utils.printTreePretty(root);
	}

	public void flattens(TreeNode root) {
		preTraverse(root);
	}


	public TreeNode preTraverse(TreeNode root){
		if (root == null) {
			return null;
		}

		if (root.left == null && root.right == null) {
			return root;
		}


		TreeNode left = root.left;
		TreeNode right = root.right;

		if (left == null) {
			return preTraverse(right);
		} else if (right == null) {
			root.right = root.left;
			root.left = null;
			return preTraverse(left);

		}

		TreeNode leftList = preTraverse(left);
		root.right = left;
		root.left = null;
		leftList.right = right;
		TreeNode rightList = preTraverse(right);


		return rightList;
	}
}