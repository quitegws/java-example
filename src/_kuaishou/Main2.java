package _kuaishou;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 20/04/2018 19:49
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String line = s.nextLine();
        int target = s.nextInt();

        String[] lines = line.split("\\s+");
        int len = lines.length;

        int[] values = new int[len];
        for (int i = 0; i < len; i++) {
            values[i] = Integer.valueOf(lines[i]);
        }

        if (values[0] >= target) {
            System.out.println(0);
            return;
        } else if (values[len - 1] < target) {
            System.out.println(len);
            return;
        }


        int i = 0;
        int j = values.length - 1;
        int m = 0;
        while (i <= j) {
           m = (j + i) / 2;
           int tmp = values[m];
           if (target < tmp) {
               j = m - 1;
           } else if (target > tmp) {
               i = m + 1;
           } else {
               System.out.println(m);
               return;
           }
        }

        System.out.println(i);
        System.out.println(m);
        System.out.println(j);
        System.out.println(Long.MAX_VALUE);

    }
}
