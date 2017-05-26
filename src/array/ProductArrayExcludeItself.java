package array;

import java.util.ArrayList;

public class ProductArrayExcludeItself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
    	if (A == null || A.size() == 0) {
    		return null;
    	}
    	int size = A.size();
    	ArrayList<Long> result = new ArrayList<>();
    	for (int i = 0; i < size; i++) {
    		Long product = 0L;
    		for (int j = 0; j < size; j++) {
    			if (i != j) {
    				product *= A.get(j);
    			}
    		}
    		result.add(product);
    	}
    	
    	return result;
    }
}
