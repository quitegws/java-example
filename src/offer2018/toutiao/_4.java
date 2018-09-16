package offer2018.toutiao;

import java.util.Scanner;

public class _4{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] bs = new int[N];
        for(int i = 0; i < N; i++){
            bs[i] = s.nextInt() & 0b11111111;

            System.out.println(Integer.toBinaryString(bs[i]));
        }

        if(N == 1){
            if (((bs[0] >>> 7) | 1 ) == 0) {
                System.out.println(1);
            }
        } else {
            int first = bs[0];
            int n = 0;
            int cnt = 0;
            while(first == 0b11111111){
                cnt ++;
            }
            n = cnt * 8;
            if (n < N ) {
                first = bs[n];
            }
            for(int i = 0; i < 7; i++){
                if ((first >>> (7 - i) & 1) == 1) {
                    n++;
                } else {
                    break;
                }
            }
            if (n < 8 && n <= N){

                for(int i = 1; i <= n - 1; i++){
                    if (((bs[i] >>> 7 & 1) == 1) && ((bs[i] >>> 6 & 1) == 0)) {
                        continue;
                    } else {
                        System.out.println(0);
                        return;
                    }
                }
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}