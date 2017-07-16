package binarytree;

/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end, count;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end, int count) {
 *         this.start = start;
 *         this.end = end;
 *         this.count = count;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class SegmentTreeQuery2 {
    /**
     *@param root, start, end: The root of segment tree and 
     *                         an segment / interval
     *@return: The count number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        // write your code here
    	if (root == null) {
    		return 0;
    	}
    	if (root.start == root.end && root.start >= start && root.end <= end) {
    		return root.count;
    	}
    	
    	int mid = (root.start + root.end) / 2;
    	int sum = 0;
    	if (root.start > end || root.end < start) {
    		return 0;
    	}
    	
    	if (start <= mid) {
    		if (mid <= end) {
    			sum += query(root.left, start, mid);
    		} else {
    			sum += query(root.left, start, end);
    		}
    	}
    	if (mid < end) {
    		if (start <= mid) {
    			sum += query(root.right, mid + 1, end);
    		} else {
    			sum += query(root.right, start, end);
    		}
    	}
    	return sum;
    }
}