package offer2018.iqiyi;

import java.util.Scanner;
import java.util.Arrays;
public class _1{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String line = s.nextLine();

        if (line == null || line.length() != 6) {
            return;
        }
        int[] nums = new int[6];
        int sum1 = 0, sum2 = 0;
        int min1 = 10, min2 = 10;
        int max1 = -1, max2 = -1;
        for(int i = 0; i < 6; i++){
            int cur = line.charAt(i) - '0';
            nums[i] = cur;
            if(i <= 2){
                sum1 += cur;
                min1 = cur < min1 ? cur : min1;
                max1 = cur > max1 ? cur : max1;
            } else {
                sum2 += cur;
                min2 = cur < min2 ? cur : min2;
                max2 = cur > max2 ? cur : max2;
            }
        }

        if(sum1 == sum2){
            System.out.println(0);
            return;
        }

        if (sum1 > sum2) {
            if (max1 > sum1 - sum2 || min2 < (10 - sum1 + sum2)) {
                System.out.println(1);
            } else if (sum1 - sum2 <= (max1 + (10 - min2))) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        } else {
            if (max2 >= sum2 - sum1 || min1 <= (10 - sum2 + sum1)) {
                System.out.println(1);
            } else if (sum2 - sum1 <= (max2 + (10 - min1))) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }

}