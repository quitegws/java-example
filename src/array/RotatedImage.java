package array;

public class RotatedImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void rotate2(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return;
		} 
		if (matrix[0] == null || matrix[0].length == 0) {
			return;
		}
		
		int n = matrix.length;
		int tmp[][] = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tmp[i][j] = matrix[i][j];
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[j][n - i - 1] = tmp[i][j];
			}
		}
	}
	
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int length = matrix.length;

        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < (length + 1) / 2; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[length - j - 1][i];
                matrix[length -j - 1][i] = matrix[length - i - 1][length - j - 1];
                matrix[length - i - 1][length - j - 1] = matrix[j][length - i - 1];
                matrix[j][length - i - 1] = tmp;
            }
        }   
    }
	
}
