package binarytree;

import java.util.LinkedList;
import java.util.Queue;


public class Utils {
	public static TreeNode cloneNode(TreeNode node) {
		if (node == null) {
			return null;
		} else {
			TreeNode clone = new TreeNode(node.val);
			clone.left = node.left;
			clone.right = node.right;
			return clone;
		}	
	}
	public static TreeNode NewTree(){
		TreeNode root = null;
		
		return root;
	}
	public void printTree(TreeNode<?> root){
		if(root == null)
			return;
		Queue<TreeNode<?>> queue =  new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode<?> node = queue.poll();
			System.out.print(node.val +",");
			if(node.left != null)
				queue.add(node.left);
			if(node.right != null)
				queue.add(node.right);
		}
	}
}
