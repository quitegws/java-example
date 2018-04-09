package _toutiao;

import java.util.*;

/**
 * @Author: gws
 * @Date: 24/03/2018 19:30
 * @Description:
 */
public class Main3 {
    static ArrayList<Integer> list;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        list = new ArrayList<>();
        dfs(1,1,n,0);
        int[] nums = new int[list.size()];
        for(int i = 0; i < nums.length; i++){
            nums[i] = list.get(i);
        }
        Arrays.sort(nums);
        System.out.println(nums[0]);
    }
    public static void dfs(int s, int m, int n, int count){
        if (s == n) {
            list.add(count);
            return;
        }
        if (s > n) {
            return;
        }
        dfs(s * 2, s, n, count + 1);
        dfs(s + m, m, n ,count + 1);
    }
}