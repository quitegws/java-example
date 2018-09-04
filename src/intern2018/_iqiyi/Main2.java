package intern2018._iqiyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 19/04/2018 19:47
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] values = new int[3];
        values[0] = s.nextInt();
        values[1] = s.nextInt();
        values[2] = s.nextInt();

        Arrays.sort(values);

        int a = values[0];
        int b = values[1];
        int c = values[2];

        int a1 = (c - a) / 2;
        int b1 = (c - b) / 2;


        b = b + b1 * 2;
        a = a + a1 * 2;

        if (a == b && b == c) {
            System.out.println(a1 + b1);
        } else if (a == c || b == c) {
            System.out.println(a1 + b1 + 2);
        } else if (a != c && b != c) {
            System.out.println(a1 + b1 + 1);
        }

    }
}
