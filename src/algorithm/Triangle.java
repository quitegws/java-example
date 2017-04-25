package algorithm;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minimumTotal(new int[][]{{-1,0,0},{2,3,0},{1,-1,-3}}));

	}
//	[
//     [-1],
//    [2,3],
//   [1,-1,-3],
//  [4,1,8,3]

    public static int minimumTotal(int[][] triangle) {
        // write your code here
    	if (triangle == null || triangle.length == 0) {
    		return -1;
    	}
    	if (triangle[0] == null || triangle[0].length == 0) {
    		return -1;
    	}
    	
    	int row = triangle.length;
    	int[][] f = new int[row][row];
    	
    	f[0][0] = triangle[0][0];
    	
    	for (int i = 1; i < row; i++) {
    		f[i][0] = f[i - 1][0] + triangle[i][0];
    		f[i][i] = f[i - 1][i - 1] + triangle[i][i];
    	}
    	
    	for (int i = 1; i < row; i++) {
    		for (int j = 1; j < i; j++) {
    			f[i][j] = Math.min(f[i - 1][j], f[i - 1][j - 1]) + triangle[i][j];
    		}
    	}
    	int sum = Integer.MAX_VALUE;
    	for (int i = 0; i < row; i++) {
    		sum = Math.min(f[row - 1][i], sum);
    	}
    	return sum;
    }

}
