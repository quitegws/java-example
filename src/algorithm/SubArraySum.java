package algorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
//	Given an integer array, find a subarray where the sum of numbers is zero. 
//	Your code should return the index of the first number and the index of the last number.
    public static ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
    	if (nums == null) {
    		return null;
    	}
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	int len = nums.length;
    	int sum = 0;
    	map.put(0, -1);
    	for (int i = 0; i < len; i++) {
    		sum += nums[i];
    		
    		if (map.containsValue(sum)) {
    			result.add(map.get(sum) + 1);
    			result.add(i);
    			return result;
    		}
    		
    		map.put(sum, i);
    	}
    	
    	
    	return result;
    	
    }
}
