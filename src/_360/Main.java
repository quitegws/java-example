package _360;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 31/03/2018 19:39
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if (k <= 0) {
            return;
        }
        for (int i = 0; i < k; i++) {
            int n = scanner.nextInt();
            int sum = 0;
            if (n <= 0) {
                continue;
            }
            for (int j = 0; j < n; j++) {
                int x1 = scanner.nextInt();
                int y1 = scanner.nextInt();
                int x2 = scanner.nextInt();
                int y2 = scanner.nextInt();

                sum += (x2 - x1 + 1) * (y2 - y1 + 1);
            }

            System.out.println(sum);
        }
    }
}
