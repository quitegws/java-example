package binarytree;

import java.util.ArrayList;
import java.util.Collections;
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
public class LowestCommonAncestor {
    /**
     * @param root: The root of the binary search tree.
     * @param A and B: two nodes in a Binary.
     * @return: Return the least common ancestor(LCA) of the two nodes.
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        // write your code here
    	if (root == null) {
    		return null;
    	}
    	if (A == null) {
    		return B;
    	}
    	if (B == null) {
    		return A;
    	}
    	
    	ArrayList<TreeNode> list1 = new ArrayList<>();
    	ArrayList<TreeNode> list2 = new ArrayList<>();
    	TreeNode node = A;
    	TreeNode parent = null;
    	list1.add(A);
    	while (root != (parent = getParents(root, node))) {
    		list1.add(parent);
    		node = parent;
    	}
    	list1.add(root);
    	
    	node = B;
    	list2.add(B);
    	while (root != (parent = getParents(root, node))) {
    		list2.add(parent);
    		node = parent;
    	}
    	list2.add(root);
    	Collections.reverse(list1);
    	Collections.reverse(list2);
    	
    	int i = 0;
    	while (list1.get(i) == list2.get(i)) {
    		i++;
    		if (i >= Math.min(list1.size(), list2.size())) {
    			break;
    		}
    	}
    	
    	return list1.get(i-1);
    	
    }
    
    
    public TreeNode getParents(TreeNode root, TreeNode node){
    	if (root == null || node == null) {
    		return null;
    	}
    	if (root == node) {
    		return root;
    	}
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode parent = null;
    	while (root != null || !stack.isEmpty()) {
    		while (root != null) {
    			stack.push(root);
    			root = root.left;
    		}
    		root = stack.pop();
    		if (node == root.left || node == root.right) {
    			return root;
    		}
    		root = root.right;
    	}
    	return parent;
    }
    
    public ArrayList<TreeNode> getNodes(Stack<TreeNode> stack){
    	ArrayList<TreeNode> list = new ArrayList<>();
    	if (stack.isEmpty()) {
    		return list;
    	}
    	while (!stack.isEmpty()) {
    		list.add(stack.pop());
    	}
    	Collections.reverse(list);
    	return list;
    }
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	TreeNode root = new TreeNode(0);
    	TreeNode node1 = new TreeNode(1);
    	TreeNode node2 = new TreeNode(2);
    	TreeNode node3 = new TreeNode(3);
    	TreeNode node4 = new TreeNode(4);
    	
    	root.right = node1;
    	node1.right = node2;
    	node2.right = node3;
    	node3.right = node4;
    	
    	Utils.printTreePretty(root);
//    	root = Utils.newTreeFromArray(new String[]{"1","#","2","#","3","#","4","#","5"});
    	System.out.println(new LowestCommonAncestor().lowestCommonAncestor(root, node4, node2).val);;
    }
}