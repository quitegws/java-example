package array;

import java.util.ArrayList;
import java.util.Arrays;

public class BackPack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new BackPack2().backPack(10, new int[]{2, 3, 5, 7}));
		System.out.println();
		System.getProperties().list(System.out);
	}
    public int backPackII(int m, int[] A, int V[]) {
        // write your code here
    	if (m <= 0 || A == null || V == null || 
    		A.length != V.length || A.length == 0 || V.length == 0) {
    		return 0;
    	}
    	
    	
    	
    	return 0;
    }
    
    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        // write your code here
    	if (A.length==0) return 0;
    	
    	int len = A.length;
    	boolean[] size = new boolean[m + 1];
    	Arrays.fill(size, false);
    	size[0] = true;
    	for (int i=1;i<=len;i++) {
            for (int j=m;j>=0;j--){
                if (j-A[i-1]>=0 && size[j-A[i-1]])
                    size[j] = size[j-A[i-1]];
            }
    	}
    	
    	for (int i = len; i >= 0; i--) {
    		if (size[i]) return i;
    	}
    	return 0;
    }
    
}
