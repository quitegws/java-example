package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeUtils {
	//recursive
	public static List preOrderTraverse(TreeNode root){
		List<TreeNode> list = new ArrayList<TreeNode>();
		if (root != null) {
			list.add(root);
			list.addAll(preOrderTraverse(root.left));
			list.addAll(preOrderTraverse(root.right));
		}					
		return list;
	}
	//not recursive
	public static List preOrderTraverse2(TreeNode root){
		List<TreeNode> list = new ArrayList<TreeNode>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		while (node != null || !stack.empty()) {
			while (node != null) {
				list.add(node);
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			node = node.right;
		}
		return list;
	}
	//recursive
	public static List inOrderTraverse(TreeNode root){
		List list = new ArrayList<>();
		if (root != null) {
			list = inOrderTraverse(root.left);
			list.add(root);
			list.addAll(inOrderTraverse(root.right));
		}
		return list;
	}
	//not recursive
	public static List inOrderTraverse2(TreeNode root){
		List<TreeNode> list = new ArrayList<TreeNode>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		
		while (node != null || !stack.empty()) {
			while (node != null) {
				stack.push(node.left);
				node = node.left;
			}
			node = stack.pop();
			list.add(root);
			node = node.right;
		}
		return list;
	}
	//recursive
	public static List postOrderTraverse(TreeNode root){
		List list = new ArrayList<TreeNode>();
		if (root != null) {
			list = postOrderTraverse(root.left);
			list.addAll(postOrderTraverse(root.right));
			list.add(root);
		}
		return list;
	}
	//not recursive
	public static List postOrderTraverse2(TreeNode root){
		List<TreeNode> list = new ArrayList<TreeNode>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		
		while (node != null || !stack.empty()) {
			while (node != null) {
				stack.push(node.left);
				node = node.left;
			}
			node = stack.pop();
			list.add(node);
			node = node.right;
		}
		list.add(root);
		return list;
	}
}
