package array;

public class PaintHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int costs[][] = new int[][]{{14,2,11},{11,14,5},{14,3,10}};
		System.out.println(new PaintHouse().minCost(costs));
	}

    /**
     * @param costs n x 3 cost matrix
     * @return an integer, the minimum cost to paint all houses
     */
    public int minCost(int[][] costs) {
        // Write your code here
    	if (costs == null || costs.length == 0) {
    		return 0;
    	}
    	
    	if (costs[0] == null || costs[0].length == 0) {
    		return 0;
    	}
    	int row = costs.length;
    	int col = costs[0].length;
    	if (col != 3) {
    		return 0;
    	}
    	int cost[][] = new int[row][col];
    	for (int i = 0; i < col; i++) {
    		cost[0][i] = costs[0][i];
    	}
    	for (int i = 1; i < row; i++) {
    		for (int j = 0; j < col; j++) {
    			int costNow = Integer.MAX_VALUE;
    			for (int k = 0; k < col; k++) {
    				if (k != j) {
    					costNow = Math.min(costNow, cost[i  - 1][k]);
    				}
    			}
    			cost[i][j] = costs[i][j] + costNow;
    			
    		}
    	}
    	int min = Math.min(cost[row - 1][0], cost[row - 1][1]);
    	return Math.min(min, cost[row - 1][2]);
    }
}
