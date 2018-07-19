package array;

/**
 * @Author: gws
 * @Date: 20/05/2018 23:54
 * @Description:
 */
public class FindTargetSumWays {
    public static void main(String[] args) {
        FindTargetSumWays findTargetSumWays = new FindTargetSumWays();
        int[] a = new int[]{1,0};

        System.out.println(findTargetSumWays.findTargetSumWays(a,1));
        System.out.println(findTargetSumWays.find(0,a,1));
    }

    public int findTargetSumWays(int[] nums, int S) {
        return findTargetSumWays(nums, 0, S);
    }

    public int findTargetSumWays(int[] nums, int p, int s){
        if ( p < 0 || p > nums.length) {
            return 0;
        }
        if (p == nums.length ) {
            if (s == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        return findTargetSumWays(nums, p + 1, s - nums[p]) +
                findTargetSumWays(nums, p + 1, s + nums[p]);
    }
    private int find(int p, int[] nums, int sum) {
        if (p == nums.length) {
            if (sum == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        return find(p + 1, nums, sum + nums[p]) + find(p + 1, nums, sum - nums[p]);
    }

}
