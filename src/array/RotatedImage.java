package array;

public class RotatedImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void rotate(int[][] matrix) {
		if (matrix == null || matrix[0] == null) {
			return;
		} 
		if (matrix.length == 0 || matrix[0].length == 0) {
			return;
		}
		
		int n = matrix.length;
		int cnt = 0;
		for (int i = 0; i < n - cnt; i++) {
			for (int j = 0; j < n - cnt; j++) {
				swap(i, j);
			}
			cnt++;
		}
	}
}
