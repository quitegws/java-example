package _jd;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 09/04/2018 19:38
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coins = scanner.nextLine();
        if (coins == null || coins.length() == 0) {
            System.out.println(0);
            return;
        }
        int fun = 0;
        for (int i = 0; i < coins.length(); i++) {
            if ((i - 1 >= 0 && coins.charAt(i - 1) != coins.charAt(i)) || (i + 1 < coins.length() && coins.charAt(i) != coins.charAt(i + 1))) {
                fun++;
            }
        }

        System.out.println(fun);
    }
}
