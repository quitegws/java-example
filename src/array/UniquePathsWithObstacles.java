package array;

/**
 * @Author: gws
 * @Date: 22/04/2018 11:50
 * @Description:
 */
public class UniquePathsWithObstacles {
    public static void main(String[] args) {

    }
//    一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
//
//机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
//
//现在考虑网格中有障碍物。那么从左上角到右下角将会有多少条不同的路径？
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null) return 0;
        if (obstacleGrid[0] == null) return 0;
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int[][] dp = new int[row][col];

        boolean flag = false;
        for (int i = 0; i < row; i++) {
            if (obstacleGrid[i][0] == 1) {
                dp[i][0] = 0;
                flag = true;
            } else if (!flag){
                dp[i][0] = 1;
            } else {
                break;
            }

        }
        flag = false;
        for (int i = 0; i < col; i++) {
            if (obstacleGrid[0][i] == 1) {
                dp[0][i] = 0;
                flag = true;
            } else if (!flag) {
                dp[0][i] = 1;
            } else {
                break;
            }
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[row - 1][col - 1];
    }

}
