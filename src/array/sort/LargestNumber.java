package array.sort;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: gws
 * @Date: 04/05/2018 19:18
 * @Description:
 */
public class LargestNumber {
    public String largestNumber(int[] nums){
        int len = nums.length;
        Integer[] copy = new Integer[len];
        for (int i = 0; i < len; i++) {
            copy[i] = nums[i];
        }
        Arrays.sort(copy, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                if (s1.compareTo(s2) > 0) return -1;
                else if (s1.compareTo(s2) < 0) return 1;
                else return 0;
            }
        });

        String res = "";
        for (int i = 0; i < len; i++) {
            res += copy[i];
        }
        int i = 0;
        while (res.charAt(i) == '0' && i < res.length() - 1) {
            i++;
        }
        return res.substring(i);
    }
    public static void main(String[] args) {
        LargestNumber largestNumber = new LargestNumber();
        int[] a = new int[]{10,2};
        System.out.println(largestNumber.largestNumber(a));
    }
}
