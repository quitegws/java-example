package algorithm;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs(44));
	}

	public static int climbStairs(int n){
		if (n == 1 || n == 2) {
			return n;
		}
		
		int[] chart = new int[n];
		chart[0] = 1;
		chart[1] = 2;
		
		for (int i = 2; i < n; i++) {
			chart[i] = chart[i - 1] + chart[i - 2];
		}
		return chart[n - 1];
	}
}
