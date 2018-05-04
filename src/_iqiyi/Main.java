package _iqiyi;

/**
 * @Author: gws
 * @Date: 19/04/2018 19:20
 * @Description:
 */
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n < 3) {
            return;
        }

        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = s.nextInt();
        }

        int one = values[0];
        int two = values[1];
        int three = values[2];


        int good = 0;

        if (one == two && two == three) {
            good = one;
        } else {
            if (one == two) {
                System.out.println(3);
            } else if (one == three) {
                System.out.println(2);
            } else if (two == three) {
                System.out.println(1);
            }
            return;
        }

        for (int i = 3; i < n; i++) {
            int cur = values[i];
            if (cur != good) {
                System.out.println(i + 1);
                return;
            }
        }

    }
}