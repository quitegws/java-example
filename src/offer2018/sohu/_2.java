package offer2018.sohu;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 13/09/2018 19:34
 * @Description:
 */
public class _2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 2;

        int i = 1;
        int sum = 0;
        while(sum < n) {
           sum += i;
           i++;
        }
        if(sum == n){
            System.out.println(i);
            return;
        }
        int start = i - 1;
        if (sum - n % 2 == 0) {
            System.out.println(start);
        } else {
            if (start % 2 == 0) {
                System.out.println(start + 1);
            } else {
                System.out.println(start + 2);
            }
        }

    }
}
