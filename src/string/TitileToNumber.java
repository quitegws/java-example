package string;

/**
 * @Author: gws
 * @Date: 06/05/2018 22:47
 * @Description:
 */
public class TitileToNumber {
    public static void main(String[] args) {
        TitileToNumber titileToNumber = new TitileToNumber();
        System.out.println(titileToNumber.titleToNumber("AB"));
    }
    public int titleToNumber(String s) {
        int len = s.length();
        int sum = 0;
        char c = 'A' - 1;
        for(int i = len - 1; i>= 0; i--) {
            sum += (s.charAt(i) - c) * Math.pow(26.0, len - i - 1);
        }
        return sum;
    }
}
