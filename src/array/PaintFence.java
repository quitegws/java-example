package array;

public class PaintFence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int numWays(int n, int k) {
        // Write your code here
        if (n == 0 || k == 0) {
            return 0;
        }    
        
        int result = 1;
        for (int i = 0; i < n - 1; i++) {
        	result *= (n - 1);
        }
        return n * result;
    }
}
