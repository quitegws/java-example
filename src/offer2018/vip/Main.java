package offer2018.vip;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();


        int[] hehehe = new int[n * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hehehe[i * n + j] = in.nextInt();
            }
        }

        Arrays.sort(hehehe);
        int pre = 0;
        int less = 1;
        for (int i = 0; i < n * n; i++) {
            int num = hehehe[i];
            if (i == 0) {
                pre = num;
            } else {
                if (num == pre) {

                } else {
                    less++;
                }
            }
            if(less == k){
                System.out.println(num);
                return;
            }
        }
    }
}