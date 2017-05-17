package array;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxSubArray(new int[]{-2,-3,-100,-1,-50}));
	}
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public static int maxSubArray(int[] nums) {
        // write your code
    	if (nums == null || nums.length == 0) {
    		return 0;
    	}
    	if (nums.length == 1) {
    		return nums[0];
    	}
    	int sum = Integer.MIN_VALUE;
    	int cursum = 0;
    	for (int i = 0; i < nums.length; i++) {
    		cursum += nums[i];
    		if (cursum > sum) {
    			sum = cursum;
    		}
    		if (cursum < 0) {
    			cursum = 0;
    		}
    	}
    	return sum;
    }

}
