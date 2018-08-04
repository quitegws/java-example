package index;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gws
 * @Date: 02/08/2018 23:56
 * @Description:
 */
public class _77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        backtracking(k, 0, nums, new ArrayList(), result);
        return result;
    }

    void backtracking(int k, int start, int[] nums, List<Integer> curr, List<List<Integer>> result) {
        if (curr.size() == k) {
            result.add(new ArrayList(curr));
        } else if (curr.size() < k) {
            for (int i = start; i < nums.length; i++) {
                curr.add(nums[i]);
                backtracking(k, i + 1, nums, curr, result);
                curr.remove(curr.size() - 1);
            }
        }
    }
}
