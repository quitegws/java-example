package string;

/**
 * @Author: gws
 * @Date: 19/04/2018 13:22
 * @Description:
 */
public class StringToInt {
    public static void main(String[] args) {
        System.out.println(myAtoi("-2147483648"));

        System.out.println(Integer.MAX_VALUE > Integer.MAX_VALUE + 1);
    }
    public static int myAtoi(String str) {
        String s = str.trim().split(" ")[0];
        int flag = 1;
        boolean signed = false;
        if (s.startsWith("-")) {
            flag = -1;
            signed = true;
        } else if (s.startsWith("+")){
            signed = true;
        }

        int res = 0;
        for(int i = signed ? 1 : 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                if (res > (Integer.MAX_VALUE - (c - '0'))/10) {
                    return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res * 10 + c - '0';
            } else {
                return flag * res;
            }

        }

        return flag * res;
    }
}
