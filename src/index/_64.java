package index;

/**
 * @Author: gws
 * @Date: 07/09/2018 15:44
 * @Description:
 */
public class _64 {

    public static void main(String[] args) {
        int[][] nums = new int[][]{  {1,3,1},
        {1,5,1},
        {4,2,1}};

        System.out.println(minPathSum(nums));
    }

    public static int minPathSum(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int j = 1; j < m; j++){
            dp[j][0] = grid[j][0] + dp[j - 1][0];
        }
        for(int i = 1; i < n; i++){
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m-1][n-1];
    }
}
