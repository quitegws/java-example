package math;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: gws
 * @Date: 21/03/2018 12:06
 * @Description:
 */
public class DigitDivideNumbers {

    public final String one = "11111111";
    public final String zero = "00000000";

    public List<Integer> digitDivideNums(int lower, int upper) {
        // write your code here
        if (lower > upper) {
            return null;
        }
        List<Integer> res = new LinkedList<Integer>();
        int loop = 1;

        int head = 1;
        for (int i = lower; i<= upper; i += loop) {
            String s = String.valueOf(i);
            if (s.contains("0")) {
                continue;
            }

            if (isDigitDivideNums(i)) {
                res.add(i);
                head = Integer.valueOf(s.substring(0,1));

            }
            loop = getNextLoop(lower, i, upper);

        }

        return res;
    }

    private int getNextLoop(int lower, int num, int upper) {
        if (num < lower && num >= upper) {
            return 0;
        }
        int loop = 1;
        String s = String.valueOf(num);
        StringBuilder sb = new StringBuilder(s);

        int len = s.length();
        int i = 0;
        int j = s.length() - 1;

        boolean[] flag = new boolean[10];
        int k = 1;

        while (i < j) {
            int ii = Integer.valueOf(String.valueOf(s.charAt(i)));
            int jj = Integer.valueOf(String.valueOf(s.charAt(j)));

            if (!flag[ii]) {
                flag[ii] = true;
                k *= ii;
            }
            int cur = Integer.valueOf(s.substring(0,i + 1) + getZeros(len - i));


        }
        return 0;
    }

    public void setBooleans(boolean[] booleans, boolean bool){
        for (int i = 0; i < booleans.length; i++) {
            booleans[i] = bool;
        }
    }

    public String getZeros(int cnt){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cnt; i++) {
            sb.append("0");
        }
        return sb.toString();
    }

    public boolean isDigitDivideNums(int num){
        if (num <= 0) {
            return false;
        }
        if (num >= 1 && num <=9) {
            return true;
        }
        boolean flag = true;
        int cur = num;

        while(cur > 0){
            int left = cur % 10;
            if (num % left != 0) {
                flag = false;
                break;
            }
            cur /= 10;
        }

        return flag;

    }

    public static void main(String[] args) {
        List<Integer> list = new DigitDivideNumbers().digitDivideNums(1, 22);
        System.out.println(list);

    }
}
