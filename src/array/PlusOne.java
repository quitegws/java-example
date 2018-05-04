package array;

/**
 * @Author: gws
 * @Date: 18/04/2018 00:17
 * @Description:
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] a = {1,0};
        int[] b = plusOne(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
    public static int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0) return null;
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int tmp = digits[i] + carry;
            carry = tmp / 10;
            digits[i] = tmp % 10;
        }

        if (carry == 0) return digits;
        else {
            int[] res = new int[1 + digits.length];
            res[0] = carry;
            for(int i = 0; i < digits.length; i++){
                res[i + 1] = digits[i];
            }
            return res;
        }
    }
}
