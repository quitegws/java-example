package intern2018._toutiao;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 24/03/2018 19:30
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String nstr = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i = 0; i < nstr.length(); i++) {
            if (nstr.charAt(nstr.length() - i - 1) - '0' == 1) {
                cnt += Math.pow(2.0 , i);
            }
        }
        System.out.println(cnt);
    }
}
