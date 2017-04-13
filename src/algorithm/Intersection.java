/**
 * 
 */
package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author gws
 *
 */
public class Intersection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = intersection(new int[]{1,2,3,1,2,2},new int[]{3,2,2});
		PrintUtils.printArray(result, "a");
	}
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Write your code here
    	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i = 0; i < nums1.length; i++){
    		if (map.containsKey(nums1[i])){
    			map.put(nums1[i], map.get(nums1[i]) + 1);
    		}else{
    			map.put(nums1[i], 1);
    		}
    	}
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	for (int j = 0; j < nums2.length; j++){
    		if (map.containsKey(nums2[j]) && map.get(nums2[j]) > 0){
    			list.add(nums2[j]);
    			map.put(nums2[j], map.get(nums2[j]) - 1);
    		}
    	}
    	int[] result = new int[list.size()];
    	int index = 0;
    	for (Integer integer : list){
    		result[index] = integer;
    		index++;
    	}
    	return result;
    }
}
