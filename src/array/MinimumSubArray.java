package array;

import java.util.ArrayList;
import java.util.Iterator;

public class MinimumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minSubArray(new int[]{1,2,3,-3,-4,2,-3,-5}));
	}
    /**
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    public static int minSubArray(int[] a) {
        // write your code
    	int sum = Integer.MAX_VALUE;
    	int cursum = 0;
//    	int[] a = new int[nums.size()];
//    	int j = 0;
//    	Iterator<Integer> iter = nums.iterator();
//    	while (iter.hasNext()) {
//    		a[j++] = iter.next();
//    	}
    	
    	for (int i = 0; i < a.length; i++) {
    		cursum += a[i];
    		if (cursum < sum) {
    			sum = cursum;
    		}
    		if (cursum > 0) {
    			cursum = 0;
    		}
    	}
    	return sum;
    }

}
