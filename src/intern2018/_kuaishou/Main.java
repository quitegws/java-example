package intern2018._kuaishou;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 20/04/2018 19:43
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        long y = s.nextLong();
        long n = s.nextLong();

        System.out.println(power(x, y, n));
    }
    public static long power(long x, long y, long mod) {
        long t = 1;
        while (y > 0) {
            if (y % 2 == 1) {
                y -= 1;
                t = t*x%mod;
            } else {
                y /= 2;
                x = x*x%mod;
            }
        }
        return t%mod;
    }
}
