package binarytree;

import java.util.ArrayList;

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
public class PostOrderTraversal {
	
    /**Recursion
     * @param root: The root of binary tree.
     * @return: Postorder in ArrayList which contains node values.
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        // write your code here
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        traverse(root, list);
        return list;
    }
    
    public void traverse(TreeNode node, ArrayList<Integer> list){
        if (node == null){
            return ;
        }
        traverse(node.left, list);
        traverse(node.right, list);
    
        list.add((Integer)node.val);
    }
}