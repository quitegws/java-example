package _toutiao;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        if (n <= 0) {
            System.out.println(0);
            return;
        }
        Arrays.sort(nums);

        int cnt = 0;

        int i = n - 1;
        int j = n - 1;

        while( i >= 0 && j >= 0) {
            while(i != n -1 && i >= 0 && nums[i] == nums[i + 1]){
                i--;
            }
            while(j != n-1 && j >= 0 && nums[j] == nums[j + 1]){
                j--;
            }
            if(i >= 0 && j >= 0){
                int t = nums[j] - nums[i];
                if (t == k) {
                    cnt++;
                    i++;j--;
                }else if (t > k){
                    j--;
                } else{
                    i--;
                }
            }
        }

        System.out.println(cnt);
    }
}