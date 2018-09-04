package intern2018._360;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 31/03/2018 20:24
 * @Description:
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] a = new int[m][2];
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            a[i][0] = u;
            a[i][1] = v;
        }


    }
}
