package intern2018._meituan;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 22/03/2018 20:12
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        int ls = s.length();
        int lt = t.length();

        int loop = ls - lt;
        int res = 0;


        for (int i = 0; i <= loop; i++) {
            String subs = "";
            if (i + lt > ls) {
                subs = s.substring(i);
            } else {
                subs = s.substring(i, i + lt);
            }
            res += getInstance(t,subs);
        }
        System.out.println(res);
    }

    public static int getInstance(String s1,String s2){
        if (s1.length() != s2.length()) {
            return 0;
        }

        int res = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                res++;
            }
        }

        return res;
    }
}
