package offer2018._360;

import java.util.*;

/**
 * @Author: gws
 * @Date: 17/09/2018 20:48
 * @Description:
 */
public class _3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        int sum = 0;
        for(ArrayList<Integer> l : Permutation(nums)){
            for(int i = 1; i < l.size(); i++){
                sum += Math.abs(l.get(i-1) - l.get(i));
            }
        }

        System.out.println(sum);
    }
    public static ArrayList<ArrayList<Integer>> Permutation(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (nums != null && nums.length > 0) {
            backTracking(nums, 0, res, new ArrayList<>());
        }
        return res;
    }

    public static void backTracking(int[] cs, int i, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> tmp) {
        if (i == cs.length - 1) {
            addALL(cs, tmp);
            list.add(tmp);
            tmp.clear();
        } else {
            for (int j = i; j < cs.length; j++) {
                swap(cs, i, j);
                backTracking(cs, i+1, list, tmp);
                swap(cs, i, j);
            }
        }
    }

    public static void swap(int[] cs, int i, int j) {
        int temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
    public static void addALL(int[] nums, List<Integer> list){
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
    }
}
