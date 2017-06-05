package array;

public class FindPeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPeak(new int[]{1, 2, 1, 3, 4, 5, 7, 6}));
	}
    public static int findPeak(int[] A) {
        // write your code here
    	if (A == null || A.length <= 2) {
    		return -1;
    	}
    	int len = A.length;
    	
    	int i = 1;
    	
    	while (i < len - 1) {
    		if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
    			return i;
    		} else {
    			i++;
    		}
    	}
    	return -1;
    }
}
