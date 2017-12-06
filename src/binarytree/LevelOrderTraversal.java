package binarytree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

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
 
 
public class LevelOrderTraversal {
    /**
     * @param root: The root of binary tree.
     * @return: Level order a list of lists of integer
     */
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // write your code here
    	ArrayList result = new ArrayList<>();
    	if (root == null) {
    		return result;
    	}
    	Queue<TreeNode> queue = new LinkedList<>();
    	queue.offer(root);
    	while (!queue.isEmpty()) {
    		int len = queue.size();
    		ArrayList<Integer> list = new ArrayList<>();
    		
    		for (int i = 0; i < len; i++) {
    			TreeNode node = (TreeNode)queue.poll();
    			list.add((int)node.val);
    			TreeNode left = node.left;
    			TreeNode right = node.right;
    			if (left != null) {
    				queue.offer(left);
    			}
    			if (right != null) {
    				queue.offer(right);
    			}
    		}
    		result.add(list);
    		
    	}
    	return result;
    }

    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        // write your code here
        ArrayList list = new ArrayList<>();
        ArrayList result = levelOrder(root);
        for (int i = result.size() - 1; i >= 0; i--) {
            list.add(result.get(i));
        }
        return list;
    }

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write your code here
    	ArrayList result = new ArrayList<>();
    	if (root == null) {
    		return result;
    	}
    	Deque<TreeNode> queue = new LinkedList<>();
    	queue.offer(root);
    	boolean flag = true;
    	while (!queue.isEmpty()) {
    		int len = queue.size();
    		ArrayList<Integer> list = new ArrayList<>();
    		
    		for (int i = 0; i < len; i++) {
    			TreeNode node = null;
    			if (flag) {
    				node = (TreeNode)queue.poll();
        			list.add((int)node.val);
        			TreeNode left = node.left;
        			TreeNode right = node.right;
        			if (left != null) {
        				queue.offer(left);
        			}
        			if (right != null) {
        				queue.offer(right);
        			}
    			} else {
    				node = queue.pollLast();
    				list.add((int)node.val);
    				TreeNode left = node.left;
    				TreeNode right = node.right;
    				
    				if (right != null) {
    					queue.offerFirst(right);
    				}
    				if (left != null) {
    					queue.offerFirst(left);
    				}
    			}
    		}
    		result.add(list);
    		flag = !flag;
    	}
    	return result;
    }
    
}