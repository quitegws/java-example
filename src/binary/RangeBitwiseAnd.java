package binary;

/**
 * @Author: gws
 * @Date: 23/04/2018 21:51
 * @Description:
 */
public class RangeBitwiseAnd {
    public static void main(String[] args) {
        RangeBitwiseAnd rangeBitwiseAnd = new RangeBitwiseAnd();
        System.out.println(rangeBitwiseAnd.rangeBitwiseAnd(5,7));
    }
    public int rangeBitwiseAnd(int m, int n) {
        if (m >= n) return m;
        int cnt = 0;

        while (n != m) {
            n >>= 1;
            m >>= 1;
            cnt++;
        }

        return m << cnt;
    }
}
