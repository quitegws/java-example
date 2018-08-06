package index;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gws
 * @Date: 02/08/2018 22:03
 * @Description:
 */
public class _46 {

    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            if (nums.length == 0 || nums.length == 0) {

            }
            bt(nums,cur,res);
            return res;
        }

        void bt(int[] nums, List<Integer> cur, List<List<Integer>> res){
            for (int i = 0; i < nums.length; i++) {
                int n = nums[i];


            }
        }
    }

    class Solution2{
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList();
            result.add(new ArrayList<>());
            return backtracking(result, nums, 0);
        }

        private List<List<Integer>> backtracking(List<List<Integer>> result, int[] nums, int pos) {
            if (pos == nums.length) {
                return result;
            }
            List<List<Integer>> newResult = new ArrayList();
            for (List<Integer> eachList : result) {
                for (int i = 0; i <= eachList.size(); i++) {
                    //attn: i starts from 0
                    List<Integer> newList = new ArrayList(eachList);
                    newList.add(i, nums[pos]);
                    newResult.add(newList);
                }
            }
            result = newResult;
            return backtracking(result, nums, pos + 1);
        }
    }
}
