package array;

public class SearchA2DMatrix {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix2(int[][] matrix, int target) {
        // write your code here
    	if (matrix == null ) {
    		return false;
    	}
    	if ( matrix.length == 0 ) {
    		return false;
    	}
    	if ( matrix[0] == null ) {
    		return false;
    	}
    	if ( matrix[0].length == 0 ) {
    		return false;
    	}
    	
    	int row = matrix.length;
    	int col = matrix[0].length;
    	
    	if (target < matrix[0][0] || target > matrix[row - 1][col - 1]) {
    		return false;
    	}
    	
    	int i = 0;
    	int j = row - 1;
    	int colToSearch = 0;
    	if (row != 1) {
    		while (i <= j) {
    			int middle = matrix[(i + j) / 2][0];
    			
    			if (middle == target) {
    				return true;
    			} else if (middle > target) {
    				colToSearch = (i + j + 1) / 2 - 1;
    				j = (i + j) / 2 - 1;
    			} else {
    				colToSearch = (i + j + 1) / 2;
    				i = (i + j) / 2 + 1;
    			}
    		}
    	}
    	
    	i = 0;
    	j = col - 1;
    	
    	while (i <= j) {
    		int middle = (i + j) / 2;
    		if (target == matrix[colToSearch][middle]) {
    			return true;
    		} else if (target < matrix[colToSearch][middle]) {
    			j = middle - 1;
    		} else {
    			i = middle + 1;
    		}
    		
    	}
    	return false;
    }
//    [[-10,-8],[-6,-5],[-2,-2],[-1,0],[3,4],[7,7],[8,9],[10,10],[11,11],[12,14],[15,16],[17,19],[20,21],[22,22],[25,27],[28,30],[32,32],[35,36]]
//    		16
    public static void main(String[] args){
    	int[][] matrix = new int[][]{{-10,-8},{-6,-5},{-2,-2},{-1,0},{3,4},{7,7},{8,9},{10,10},
    								{11,11},{12,14},
    								{15,16},{17,19},{20,21},{22,22},{25,27},{28,30},{32,32},{35,36}};
    	int target = 16;
    	System.out.println(new SearchA2DMatrix().searchMatrix(matrix, target));
    }
    
    public static boolean searchMatrix(int[][] matrix, int target){
    	if (matrix == null || matrix.length == 0) {
    		return false;
    	}
    	if (matrix[0] == null || matrix[0].length == 0) {
    		return false;
    	}
    	
    	int row = matrix.length;
    	int col = matrix[0].length;
    	
    	int start = 0;
    	int end = row - 1;
    	
    	while (start + 1 < end) {
    		int middle = start + (end - start) / 2;
    		if (matrix[middle][0] == target) {
    			return true;
    		} else if (matrix[middle][0] <= target) {
    			start = middle;
    		} else if (matrix[middle][0] >= target) {
    			end = middle;
    		}
    	}
    	if (target >= matrix[end][0]) {
    		row = end;
    	} else if (target >= matrix[start][0]) {
    		row = start;
    	} else {
    		return false;
    	}
    	
    	start = 0;
    	end = col - 1;
    	
    	while (start < end) {
    		int middle = start + (end - start) / 2;
    		int cur = matrix[row][middle];
    		if (target == cur) {
    			return true;
    		} else if (target < cur) {
    			end = middle - 1;
    		} else {
    			start = middle + 1;
    		}
    	}
    	
    	if (matrix[row][start] == target) {
    		return true;
    	}
    	if (matrix[row][end] == target) {
    		return true;
    	}
    	return false;
    }
    
}
