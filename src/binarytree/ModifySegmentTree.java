package binarytree;

/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end, max;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end, int max) {
 *         this.start = start;
 *         this.end = end;
 *         this.max = max
 *         this.left = this.right = null;
 *     }
 * }
 */
public class ModifySegmentTree {
    /**
     *@param root, index, value: The root of segment tree and 
     *@ change the node's value with [index, index] to the new given value
     *@return: void
     */
    public void modify(SegmentTreeNode root, int index, int value) {
        // write your code here
    	if (root == null) {
    		return;
    	}
    	if (root.start == root.end && root.start == index) {
    		root.max = value;
    		return;
    	}
    	
    	int mid = (root.start + root.end) / 2;
    	
    	if (root.start <= index && mid >= index) {
    		modify(root.left, index, value);
    	} 
    	if (root.end >= index && mid < index) {
    		modify(root.right, index, value);
    	}
    	root.max = Math.max(root.left.max, root.right.max);
    }
    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    }
}