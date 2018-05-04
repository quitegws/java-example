package binary;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gws
 * @Date: 23/04/2018 16:39
 * @Description:
 */
public class SubSets {
    public static void main(String[] args) {
        SubSets subSets = new SubSets();
        int[] a = {1,2,3};
        System.out.println(subSets.subsets3(a));
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        int bound = 1 << len;
        for (int i = 0; i < bound; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) != 0) {
                    list.add(nums[j]);
                }
            }
            res.add(list);
        }
        return res;
    }
    //回溯法
    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        result.add(list);
        backtracking(result, list, nums, 0);
        return result;
    }

    private void backtracking(List<List<Integer>> result, List<Integer> list, int[] nums, int start) {
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            result.add(new ArrayList<>(list));
            backtracking(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> subsets3(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        int len = nums.length;
        int bound = (1<<len);
        for(int i = 0; i < bound ; i++){
            List<Integer> l = new ArrayList<>();

            for(int j = 0; j < len; j++){
                if ((i & (1 << j)) != 0) {
                    l.add(nums[j]);
                }

            }
            res.add(l);
        }
        return res;
    }
}
