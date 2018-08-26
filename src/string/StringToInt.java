package string;

/**
 * @Author: gws
 * @Date: 19/04/2018 13:22
 * @Description:
 */
public class StringToInt {
    public static void main(String[] args) {
//        System.out.println(myAtoi("-2147483648"));
//
//        System.out.println(Integer.MAX_VALUE > Integer.MAX_VALUE + 1);

        System.out.println("+00000".matches("[+\\-]?[0-9]+"));
        System.out.println(StringToInt.stringToInt("2147483648"));

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

    public static int stringToInt(String s){
        if (s == null || s.length() == 0) return 0;

        if (!s.matches("[+\\-]?[0-9]+")) {
            return 0;
        }
        int positive = 1;
        int start = 0;
        if (s.startsWith("-")) {
            positive = -1;
            start = 1;
        }
        if (s.startsWith("+")) {
            start = 1;
        }

        while(s.charAt(start) == '0') {
            start++;
            if (start >= s.length()) {
                return 0;
            }
        }

//        s = s.substring(start);

        int value = 0;

        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if(value >= (Integer.MAX_VALUE - (c - '0'))/10) {
                if (positive == -1 && (c - '0') > 8) {
                    return 0;
                } else if (positive == 1 && (c - '0') >= 8) {
                    return 0;
                }
            }

            value = value * 10 + c - '0';
        }

        return value * positive;
    }
}
