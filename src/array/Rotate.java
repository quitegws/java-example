package array;

/**
 * @Author: gws
 * @Date: 17/04/2018 22:14
 * @Description:
 */
public class Rotate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2};
        int k = 6;
        rotate(nums, k);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
    }

    public  static void rotate(int[] nums, int k) {
        if (k <= 0) return;
        if (nums.length <= 1) return;

        int l = nums.length;
        if(k % l == 0) return;

        int start = 0;
        int i = 0;
        int cur = nums[i];
        k = k % l;
        int cnt = 0;

        while (cnt++ < l) {
            i = (i + k) % l;
            int t = nums[i];
            nums[i] = cur;

            if (start == i) {
                ++start;
                ++i;
                cur = nums[i];
            } else {
                cur = t;
            }
        }
    }
}
