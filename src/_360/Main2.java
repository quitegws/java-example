package _360;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 31/03/2018 19:47
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k <= 0) {
            return;
        }
        long[] res = new long[k];
        for (int i = 0; i < k; i++) {
            long r = scanner.nextLong();
            long g = scanner.nextLong();
            long b = scanner.nextLong();
            res[i] = getTableCount(r,g,b);
        }
        for (int i = 0; i < k; i++) {
            System.out.println(res[i]);
        }
    }

    private static long getTableCount(long r, long g, long b) {

        long sum = Math.min((r+g+b)/3, Math.min(r+g, Math.min(g+b, r+b)));
        return sum;
    }
}
