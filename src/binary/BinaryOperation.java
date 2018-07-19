package binary;

/**
 * @Author: gws
 * @Date: 22/04/2018 17:06
 * @Description:
 */
public class BinaryOperation {
    public static void main(String[] args) {
        BinaryOperation bo = new BinaryOperation();
        System.out.println(bo.hasAlternatingBits(5));

    }
    public boolean isPowerOfTwo(int n) {
        int a = n&(n - 1);
        return a == 0 && n > 0;
    }
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int diff = 0;
        for(int i = 0; i < nums.length; i++){
            diff ^= nums[i];
        }

        diff = diff & (-diff);
        for(int i = 0; i < nums.length; i++){
            if ((nums[i] ^ diff) == 0) res[0] = nums[i];
            else res[1] ^= nums[i];
        }
        return res;
    }
    public boolean hasAlternatingBits(int n) {
        boolean res = true;
        int last = n & 1;
        n = n >> 1;
        while(n > 0){
            int t = n & 1;
            boolean flag = t == last ? false: true;
            if (!flag) return false;
            last = t;
            n >>= 1;
        }
        return res;
    }
}
