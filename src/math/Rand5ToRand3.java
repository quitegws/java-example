package math;

import java.util.Random;

/**
 * @Author: gws
 * @Date: 15/04/2018 21:58
 * @Description:
 */
public class Rand5ToRand3 {
    public static void main(String[] args) {
        int[] cnt = new int[3];
        for (int i = 0; i < 30000; i++) {
            cnt[rand3() - 1]++;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(cnt[i]);
        }
    }

    public static int rand3(){
        while(true){
            int n = rand5() - 1 + 5 * (rand5() - 1);
            if (n < 21) {
                return n % 3 + 1;
            }
        }
    }

    public static int rand5(){
        Random random = new Random();
        return random.nextInt(5) + 1;
    }
}
