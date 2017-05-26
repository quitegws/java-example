package array;

import java.util.Arrays;
import java.util.HashSet;

public class SmallestDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
    /**
     * @param A, B: Two integer arrays.
     * @return: Their smallest difference.
     */
    public int smallestDifference(int[] A, int[] B) {
    	if (A == null || A.length == 0 || B == null || B.length == 0) {
    		return 0;
    	}
    	
    	Arrays.sort(A);
    	Arrays.sort(B);
    	
    	int i = 0;
    	int j = 0;
    	
    	int smaller = Integer.MAX_VALUE;
    	
    	while (i < A.length && j < B.length) {
    		smaller = Math.min(smaller, Math.abs(A[i] - B[j]));
    		
    		if (A[i] < B[j]) {
    			i++;
    		} else {
    			j++;
    		}
    	}
    	
    	return smaller;
    }

}
