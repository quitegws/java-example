package algorithm;

import java.util.Arrays;

public class FirstMissingPositive {
    /**    
     * @param A: an array of integers
     * @return: an integer
     */
    public int firstMissingPositive(int[] A) {
        // write your code here  
        
        if (A == null || A.length == 0) {
            return 1;
        }
        int len = A.length;
        boolean[] boo = new boolean[len + 1];
        Arrays.fill(boo, false);
        
        for (int i = 0; i < len; i++) {
            int cur = A[i];
            if (cur > 0 && cur <= len) {
                boo[cur - 1] = true;
            }
        }
        
        for (int i = 0; i <= len; i++) {
        	if (!boo[i]) {
        		return i + 1;
        	}
        }
        
        return  0;
    }
    
    public static void main(String args[]){
    	System.out.println(new FirstMissingPositive().firstMissingPositive(new int[]{}));
    }
}