package array;

public class MaxArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new MaxArea().maxArea(new int[]{4,3,2,1,4}));
	}

    /**
     * @param heights: an array of integers
     * @return: an integer
     */
    public int maxArea(int[] heights) {
        // write your code here
    	if (heights == null || heights.length <= 1) {
    		return 0;
    	}
    	int len = heights.length;

    	int max = Integer.MIN_VALUE;
    	for (int i = 0; i < len; i++) {
    		for (int j = 0; j < len; j++) {
    			if (i != j) {
    				int area = Math.min(heights[i], heights[j]) * Math.abs(i - j);
    				max = Math.max(area, max);
    			}
    		}
    	}
    	return max;
    }
}
