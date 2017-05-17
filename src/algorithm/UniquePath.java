package algorithm;

public class UniquePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePath(5, 4));
	}

	public static int uniquePath(int m, int n){
		if (n == 1 || m == 1) {
			return 1;
		}

		int[][] table = new int[m][n];
		for (int i = 0; i < m; i ++) {
			table[i][0] = 1;
		}
		for (int i = 0; i < n; i ++) {
			table[0][i] = 1;
		}
		
		
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++){
				table[i][j] = table[i - 1][j] + table[i][j - 1]; 
			}
		}
		
		return table[m - 1][n - 1];
	}
}
