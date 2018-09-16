package offer2018.zhihu;

/**
 * @Author: gws
 * @Date: 09/09/2018 00:44
 * @Description:
 */
import java.util.Scanner;

public class _1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tar = s.nextInt();

        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = s.nextInt();
        }


        int l = 0;
        int h = n - 1;
        while(l <= h){
            int m = l + (h - l) / 2;
            int cur = nums[m];
            if(cur == tar){
                while(m + 1 < h){
                    if(tar == nums[m + 1]){
                        m++;
                    } else {
                        break;
                    }
                }
                System.out.println(m);
                return;
            } else if (cur < tar) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        System.out.println("-1");
    }
}