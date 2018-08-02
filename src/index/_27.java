package index;

/**
 * @Author: gws
 * @Date: 02/08/2018 00:43
 * @Description:
 */
public class _27 {

    public static void main(String[] args) {
        Solution solution = new Solution();;
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(solution.removeElement(nums, val));

        utils.PrintUtils.printArray(nums,"nums");
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int l = 0;
            int r = nums.length - 1;

            while (l <= r) {
                int cur = nums[l];
                if (cur == val) {
                    swap(nums, l, r);
                    r--;

                } else {
                    l++;
                }
            }

            return r + 1;
        }

        public void swap(int[] nums, int l, int r){
            if (nums == null || l < 0 || r >= nums.length) {
                return;
            }
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
        }
    }
}
