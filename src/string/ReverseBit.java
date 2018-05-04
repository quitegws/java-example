package string;

/**
 * @Author: gws
 * @Date: 18/04/2018 09:52
 * @Description:
 */
public class ReverseBit {
    public static void main(String[] args) {
        int n = 964176192;
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        int i =  Integer.parseInt(sb.reverse().toString(), 2);
        System.out.println(i);
    }
}
