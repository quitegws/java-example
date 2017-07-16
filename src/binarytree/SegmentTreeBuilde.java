package binarytree;

/**
 * Definition of SegmentTreeNode:
 * public class SegmentTreeNode {
 *     public int start, end;
 *     public SegmentTreeNode left, right;
 *     public SegmentTreeNode(int start, int end) {
 *         this.start = start, this.end = end;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class SegmentTreeBuilde {
    /**
     *@param start, end: Denote an segment / interval
     *@return: The root of Segment Tree
     */
    public SegmentTreeNode build(int start, int end) {
        // write your code here
    	if (start > end) {
    		return null;
    	}
    	SegmentTreeNode root = new SegmentTreeNode(start, end);
    	if (start == end) {
    		return root;
    	}
    	int leftStart = start;
    	int leftEnd = (start + end) / 2;
    	int rightStart = (start + end) / 2 + 1;
    	int rightEnd = end;
    	
    	SegmentTreeNode left = build(leftStart, leftEnd);
    	
    	SegmentTreeNode right = build(rightStart, rightEnd);
    	
    	root.left = left;
    	root.right = right;
    	
    	return root;
    	
    }
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    }
}

