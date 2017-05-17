package algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = intersection(new int[]{4,7,9,7,6,7}, new int[]{5,0,0,6,1,6,2,2,4});
		PrintUtils.printArray(result, "result");
		
	}
	
	public static int[] intersection(int[] nums1, int[] nums2){
		
		if (nums1.length == 0){
			return new int[]{};
		}
		if (nums2.length == 0){
			return new int[]{};
		}
		HashSet<Integer> set = new HashSet<Integer>();
		Set<Integer> resultSet = new HashSet<Integer>();

		for (int i = 0; i < nums1.length; i++){
			set.add(nums1[i]);
		}
		for (int j = 0; j < nums2.length; j++){
			if (set.contains(nums2[j])){
				resultSet.add(nums2[j]);
			}
		}
		int[] result = new int[resultSet.size()];
		int index = 0;
		for (Integer integer : resultSet){
			result[index++] = integer;
		}
		return result;
	}

}
