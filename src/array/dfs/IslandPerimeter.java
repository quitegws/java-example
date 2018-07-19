package array.dfs;

/**
 * @Author: gws
 * @Date: 06/05/2018 22:54
 * @Description: leetcode 463 https://leetcode-cn.com/problems/island-perimeter/description/
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {

        int sum = 0;
        int r = grid.length;
        int c = grid[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    int perimeter = 4;
                    if (i - 1 >= 0 && grid[i - 1][j] == 1) perimeter--;
                    if (i + 1 < r && grid[i + 1][j] == 1) perimeter--;
                    if (j - 1 >= 0 && grid[i][j - 1] == 1) perimeter--;
                    if (j + 1 < c && grid[i][j + 1] == 1) perimeter--;
                    sum += perimeter;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
