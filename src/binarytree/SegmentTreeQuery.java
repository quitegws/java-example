package binarytree;

import java.util.Stack;

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
public class SegmentTreeQuery {
	
	int max = Integer.MIN_VALUE;
    /**
     *@param root, start, end: The root of segment tree and 
     *                         an segment / interval
     *@return: The maximum number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        if (root.start == start && root.end == end) {
        	return root.max;
        }
        
        int mid = (root.start + root.end) / 2;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = leftMax;
        
        if (start <= mid) {
        	if (mid < end) {
        		leftMax = query(root.left, start, mid);
        	} else {
        		leftMax = query(root.left, start, end);
        	}
        }
        if (mid < end) {
        	if (start <= mid) {
        		rightMax = query(root.right, mid + 1, end);
        	} else {
        		rightMax = query(root.right, start, end);
        	}
        }
        return Math.max(leftMax, rightMax);
    }

    
    public void inTraversal(SegmentTreeNode root, int start, int end){
    	if (root == null) {
    		return; 
    	}
    	inTraversal(root.left, start, end);
    	if (root.start >= start && root.end <= end) {
    		max = Math.max(max, root.max);
    	}
    	inTraversal(root.right, start, end);
    }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    }
}