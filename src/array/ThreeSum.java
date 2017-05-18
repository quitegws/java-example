package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public ArrayList<ArrayList<Integer>> threeSum(int[] numbers) {
        // write your code here
    	if (numbers == null || numbers.length <= 2) {
    		return null;
    	}
    	Arrays.sort(numbers);
    	
    	ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> result = new ArrayList<Integer>();
    	
    	int len = numbers.length;
    	int i = 0;
    	int j = 1;
    	int k = 2;
    	
    	for (int i = 0; i < len; i++) {
    		int[] twosum = new int[len];
    		for (int j = 1; j < len; j++) {
    			twosum[j] = numbers[i] + numbers[j];
    		}
    		for (int k = 2; k < len; k++) {
    			
    		}
    	}
    	
    }
    
}
