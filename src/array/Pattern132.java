package array;

public class Pattern132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{2,3,1};
		System.out.println(find132pattern(a));
	}
    public static  boolean find132pattern(int[] nums) {
        // Write your code here
    	if (nums == null || nums.length <= 2) {
    		return false;
    	}
    	int len = nums.length;
    	int start = 0;
    	int end = len - 1;
    	
    	while (start < end) {
    		while (nums[start] >= nums[end]) {
    			start++;
    			if ((end - start) < 2) {
    				return false;
    			}
    		}
    		for (int i = start; i < end; i++) {
    			if (nums[i] > Math.max(nums[start], nums[end])) {
    				return true;
    			}
    		}
    		start = 0;
    		end--;
    	}
    	return false;
    }

}
