package visualtool.tree;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 20/03/2018 20:31
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int[] en = new int[sum];

        for (int i = 0; i < sum; i++) {
            en[i] = scanner.nextInt();
        }

        int max = 0;
        int var = 1;

        for (int i = 0; i < sum ; i++) {
            for (int j = 0; j < sum; j++) {
                if (i == j) {
                    continue;
                }
                int ming = en[i];
                int ning = en[j];
                int distory = ming + ning + distance(sum , i, j);
                if (distory == max) {
                    var ++;
                } else if (distory > max) {
                    var = 1;
                    max = distory;
                }
            }
        }

        System.out.println(max);
        System.out.println(var / 2);
    }

    public static int distance(int len, int i, int j){
        int d1 = Math.abs(i - j);
        int d2 = len - Math.max(i, j) + Math.min(i, j);
        return Math.min(d1, d2);
    }
}
