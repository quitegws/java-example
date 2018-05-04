package math;

import java.util.Random;

/**
 * @Author: gws
 * @Date: 15/04/2018 21:48
 * @Description:
 */
public class Rand5ToRand7 {
    public static void main(String[] args) {
        int[] cnt = new int[7];
        for (int i = 0; i < 70000000; i++) {
            int n = rand7();
            cnt[n - 1]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            System.out.println(cnt[i]);
        }
    }

    public static int rand7(){
        while (true){
            int n = 5 * (rand5() - 1) + rand5() - 1;
            if (n < 21) {
                return n % 7 + 1;
            }
        }
    }

    public static int rand5(){
        Random random = new Random();
        return random.nextInt(5) + 1;
    }
}
