package test;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 04/09/2018 23:58
 * @Description:
 */
public class TestScanner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str =in.nextLine();
            System.out.println(str);
        }
        in.close();

    }
}
