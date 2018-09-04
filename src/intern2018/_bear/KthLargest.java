package intern2018._bear;

import java.util.Arrays;

/**
 * @Author: bear
 * @Date: 08/05/2018 19:19
 * @Description:
 */
public class KthLargest {
    public static void main(String[] args) throws Exception {
        int[] a = new int[]{2,7,12,5,0};
        KthLargest kthLargest = new KthLargest();
        int i = kthLargest.KthLargest(a, 1);
        System.out.println(i);

        utils.PrintUtils.printArray(a,"a");
    }

    //time  complexity is nlog(n)
    // 7 5 5 2 2 2 0 0 0 0
    //[2,7,12,5,0]
    public int KthLargest(int[] nums, int k) throws Exception{
        if (nums == null || nums.length < 2) throw new IllegalArgumentException();
        int len = nums.length;
        if (k < 0 || len * (len - 1) / 2 < k) throw new IllegalArgumentException();

        Arrays.sort(nums);

        int level = 1;

        for (int i = 1; i < len; i++) {
            k = k - i;
            if (k <= 0) {
                break;
            }
            level++;
        }

        return nums[len - level - 1];
    }
}
