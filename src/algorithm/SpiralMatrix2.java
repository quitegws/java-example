package algorithm;

import java.util.Scanner;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input n : \n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] a = generateMatrix(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + ", ");
			}
			System.out.println();
		}
	}

    /**
     * @param n an integer
     * @return a square matrix
     */
    public static int[][] generateMatrix(int n) {
        // Write your code here
    	int num = 1;
    	int round = 0;
    	int[][] a = new int[n][n];
    	
    	for (int k = n; k > 0; k -= 2) {
    		if (k == 1) {
    			a[round][round] = num;
    			return a;
    		}
    		for (int i = round; i < k + round; i++) {
    			a[round][i] = num;
    			num++;
    		}
    		for (int i = round + 1; i < k + round; i++) {
    			a[i][k + round - 1] = num;
    			num++;
    		}
    		for (int i = n - round - 2; i >= round; i--) {
    			a[n - round - 1][i] = num;
    			num++;
    		}
    		for (int i = n - round - 2; i > round; i--) {
    			a[i][round] = num;
    			num++;
    		}
    		round ++;
    	}
//    	System.out.println("num : " + num);
    	return a;
    }
}
