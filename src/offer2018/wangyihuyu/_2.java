package offer2018.wangyihuyu;

import java.util.Scanner;

public class _2{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++){
            int n = s.nextInt();
            int k = s.nextInt();
            int min = min(n, k);
            int max = max(n, k);
            System.out.println(min + " " + max);
        }
    }
    public static int max(int n , int k){
        if(n == k || k == 0 || k == 1 || n <= 2){
            return 0;
        }
        if(k < n / 2){
            return k;
        } else {
            return n - k;
        }
    }
    public static int min(int n, int k){
        if (n == k){
            return 0;
        }
        if(n <= 2){
            return 0;
        }
        if(k == 1 || k == 0){
            return 0;
        }
        if(k <= n - 1){
            return 1;
        }
        else return 0;
    }

}