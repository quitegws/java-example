package array;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, 7, 11, 15};
		int target = 9;
		System.out.println();
		utils.PrintUtils.printArray(twoSum(a, target), "twoSum(a, target)");
	}
    /*
     * @param nums an array of Integer
     * @param target = nums[index1] + nums[index2]
     * @return [index1 + 1, index2 + 1] (index1 < index2)
     */
    public static int[] twoSum(int[] nums, int target) {
        // write your code here
    	if (nums == null) {
    		return null;
    	}
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
    		int cur = nums[i];
    		if (map.containsKey(target - cur)) {
    			int low = map.get(target - cur) + 1;
    			int high = i + 1;
    			return new int[]{Math.min(low, high), Math.max(low, high)};
    		} else {
    			map.put(cur, i);
    		}
    	}
    	return new int[]{};
    }
}
