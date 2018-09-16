package offer2018.wangyihuyu;

import java.util.Scanner;

public class _3{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[] vm = new int[n];
        int[] wine = new int[n];
        for(int i = 0;i < n; i++){
            vm[i] = s.nextInt();
        }
        for(int i = 0; i < m; i++){
            int order = s.nextInt();
            if(order == 2){
                int x = s.nextInt();
                if(x > n || x < 0){
                    continue;
                }
                int v = s.nextInt();
                for(int j = x - 1; j < n; j++){
                    if (v <= 0){
                        break;
                    }
                    if (wine[j] == vm[j]) {
                        continue;
                    }
                    if (wine[j] + v <= vm[j]) {
                        v=0;
                        wine[j] += v;
                        break;
                    } else {
                        v = v - (vm[j] - wine[j]);
                        wine[j] = vm[j];
                    }
                }
            } else if (order == 1) {
                int k = s.nextInt();
                if(k > 0 && k <= n)
                    System.out.println(wine[k - 1]);
            }
        }
    }
}