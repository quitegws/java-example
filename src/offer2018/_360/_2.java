package offer2018._360;

import java.util.Arrays;
import java.util.Scanner;

public class _2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();

        for(int i = 0; i < q; i++){
            int k = s.nextInt();
            int l = s.nextInt();
            int r = s.nextInt();

            int res = f(k, l, r);
            System.out.println(res);

        }

    }

    public static int f(int k, int l, int r){
        int max = 0;
        int value = 0;
        for(int i = l; i <= r; i++){
            String s = Integer.toString(i, k);
            if (k <= 10) {
                int cnt = 0;
                for(int j = 0; j < s.length(); j++){
                    if(k - 1 == (s.charAt(j) - '0')){
                        cnt++;
                    }
                }
                if(cnt >= max){
                    max = cnt;
                    value = i;
                }
            } else {
                int cnt = 0;

                for(int j = 1; j < s.length(); j++){
                    if(k - 1 == ( (s.charAt(j - 1) - '0') * 10 + (s.charAt(j) - '0')) ){
                        cnt++;
                    }
                }
                if(cnt >= max){
                    max = cnt;
                    value = i;
                }
            }

        }

        return value;
    }

}
