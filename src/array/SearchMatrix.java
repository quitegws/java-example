package array;

public class SearchMatrix {
    /**
     * @param matrix: A list of lists of integers
     * @param: A number you want to search in the matrix
     * @return: An integer indicate the occurrence of target in the given matrix
     */
    public int searchMatrix(int[][] matrix, int target) {
        // write your code here
    	if (matrix == null || matrix.length == 0) {
    		return 0;
    	}
    	if (matrix[0] == null || matrix[0].length == 0) {
    		return 0;
    	}
    	int row = matrix.length;
    	int col = matrix[0].length;
    	int i = row - 1;
    	int j = 0;
    	
    	int cnt = 0;
    	
    	while (i >= 0 && j < col) {
    		int val = matrix[i][j];
    		if (val < target) {
    			j++;
    		} else if (val > target) {
    			i--;
    		} else {
    			cnt++;
    			i--;
    			j++;
    		}
    		
    	}
    	return cnt;
    }
}
