package offer2018.toutiao;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 09/09/2018 10:11
 * @Description:
 */
public class _2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[][] depts = new int[m][m];

        for(int i = 0; i < m; i++){
            for (int j = 0; j < m; j++) {
                depts[i][j] = scanner.nextInt();
            }
        }

        int res = 0;
        for(int i = 0; i < m; i++){
            for (int j = 0; j < m; j++) {
                if (depts[i][j] == 1){
                    res++;
                }
                dfs(depts, i, j ,m);
            }
        }

        System.out.println(res);
    }
    public static void dfs(int[][] depts, int r, int c, int m) {
        if(r < 0 || r >= m || c < 0 || c >= m || depts[r][c] == 0){
            return ;
        }
        depts[r][c] = 0;
        dfs(depts, r + 1, c, m);
        dfs(depts, r - 1, c, m);
        dfs(depts, r, c + 1, m);
        dfs(depts, r, c - 1, m);
    }
}
