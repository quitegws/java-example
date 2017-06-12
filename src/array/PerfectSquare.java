package array;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PerfectSquare().numSquares(12));
	}
	/**
	 * @param n a positive integer
	 * @return an integer
	 */
	public int numSquares(int n) {
		// Write your code here
		if (n <= 0) {
			return 0;
		}
		int result = 0;
		int left = n;
		while (left > 0) {
			int i = findN(left);
			left = left - i * i;
			result++;
		}
		
		return result;
	}

	public int findN(int n){
		if (n <= 0) {
			return 0;
		}
		int i = 1;
		while (i * i <= n) {
			i++;
		}
		
		return i - 1;
	}
	
	
}
