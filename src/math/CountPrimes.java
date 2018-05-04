package math;

import java.util.Arrays;

/**
 * @Author: gws
 * @Date: 18/04/2018 14:27
 * @Description:
 */
public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimes(3));
    }
    public static int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] flags = new boolean[n - 1];
        Arrays.fill(flags, true);
        int res = 0;
        int sqrt = (int) Math.sqrt(n);

        flags[0] = false;

        for (int i = 2; i <= sqrt; i++) {
            if (flags[i - 1]){
                for(int j = i * i; j < n; j += i) {
                    flags[j - 1] = false;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (flags[i]) res++;
        }

        return res;
    }
}
