package algorithm;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * @param numbers : An array of Integer
	 * @param target : target = numbers[index1] + numbers[index2]
	 * @return : [index1 + 1, index2 + 1] (index1 < index2)
	 */
	public static int[] twoSum(int[] numbers, int target) {
		// write your code here
		if (numbers.length <= 1){
			return new int[]{0,0};
		}
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i ++){
			if (map.get(numbers[i]) != null){
				return new int[]{map.get(numbers[i]) + 1, i + 1};
			}
			map.put(target - numbers[i], i);
		}
		return result;
	}

}
