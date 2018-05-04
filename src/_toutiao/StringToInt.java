package _toutiao;

/**
 * @Author: gws
 * @Date: 14/04/2018 22:33
 * @Description:
 */
public class StringToInt {
    public static void main(String[] args) {
        String number = "032940234902394";
        long result = 0;
        for (int i = 0; i < number.length(); i++) {
            int cur = (number.charAt(i) - '0');
            result = result * 10 + cur;
        }

        System.out.println(result);
    }
}
