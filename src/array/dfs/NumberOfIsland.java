package array.dfs;

/**
 * @Author: gws
 * @Date: 04/05/2018 14:37
 * @Description:
 */
public class NumberOfIsland {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int r = grid.length;
        int c = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == '1') {
                    cnt++;
                    dfs(grid,i,j,r,c);
                }
            }
        }
        return cnt;
    }

    public void dfs(char[][] grid, int i, int j, int r, int c){
        if (i < 0 || i >= r || j < 0 || j >= c || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid,i,j-1,r,c);
        dfs(grid,i,j+1,r,c);
        dfs(grid,i-1,j,r,c);
        dfs(grid,i+1,j,r,c);
    }

    public static void main(String[] args) {

    }
}
