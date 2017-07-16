package binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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
class SerializationBinaryTree {
    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        // write your code here
    	if (root == null) {
    		return "";
    	}
    	StringBuilder sb = new StringBuilder();
    	Queue queue = new LinkedList<>();
    	queue.offer(root);
    	sb.append(root.val + ",");
    	
    	while (!queue.isEmpty()) {
    		int len = queue.size();
    		for (int i = 0; i < len; i++) {
    			TreeNode current = (TreeNode)queue.poll();
    			if (current.left != null) {
    				sb.append(current.left.val + ",");
    				queue.offer(current.left);
    			} else {
    				sb.append("#,");
    			}
    			if (current.right != null) {
    				sb.append(current.right.val + ",");
    				queue.offer(current.right);
    			} else {
    				sb.append("#,");
    			}
    		}
    	}
    	return sb.toString();
    }
    
    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {
        // write your code here
    	if (data.equals("")) {
    		return null;
    	}
    	Utils.echo(data);
    	String[] datas = data.split("\\,");
    	List list = new ArrayList<>();
    	for (int i = 0; i < datas.length; i++) {
    		list.add(datas[i]);
    	}
    	Iterator iter = list.iterator();
    	TreeNode root = new TreeNode(Integer.valueOf((String)iter.next()));
    	Queue queue = new LinkedList<>();
    	queue.offer(root);
    	while (iter.hasNext()) {
    		TreeNode node = (TreeNode)queue.poll();
    		String value = (String)iter.next();
    		if (value.equals("#")) {
    			node.left = null;
    		} else {
    			node.left = new TreeNode(Integer.valueOf(value));
    			queue.offer(node.left);
    		}
    		if (iter.hasNext()) {
    			value = (String)iter.next();
    			if (value.equals("#")) {
    				node.right = null;
    			} else {
    				node.right = new TreeNode(Integer.valueOf(value));
    				queue.offer(node.right);
    			}
    		}
    	}
    	return root;
    }
    

    public static void main(String[] args){
    	SerializationBinaryTree sbt = new SerializationBinaryTree();
    	TreeNode root = Utils.newTreeFromArray(new int[]{1,2,3,4,5,6,7});
    	Utils.printTreePretty(root);
    	String s = sbt.serialize(root);
    	TreeNode node = sbt.deserialize(s);
    	Utils.printTreePretty(node);
    }
    
}
