package array;

public class LongestContinuousIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestIncreasingContinuousSubsequence(new int[]{99,55,7,29,80,33,19,23,6,35,40,27,44,74,5,17,52,36,67,32,37,42,18,77,66,62,97,79,60,94,30,2,85,22,26,91,3,16,8,0,48,93,39,31,63,13,71,58,69,50,21,70,61,43,12,88,47,45,72,76}));
	}
    /**
     * @param A an array of Integer
     * @return  an integer
     */
    public static int longestIncreasingContinuousSubsequence(int[] A) {
        // Write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        if (A.length == 1) {
        	return 0;
        }
        int len = A.length;
        int l = 1;
        int r = 1;
        int result1 = 1;
        int result2 = 1;
        int cur = 0;
        int prv = 0;
        for (int i = 1; i < len; i++) {
            cur = A[i];
            prv = A[i - 1];
            
            if (cur > prv) {
            	l++;
            	if (r > result2) {
            		result2 = r;
            	}
            	r = 1;
            }else {
            	r++;
            	if (l > result1) {
            		result1 = l;
            	}
            	l = 1;
            }
        }
        return Math.max(Math.max(r, l), Math.max(result1, result2));
    }
}
