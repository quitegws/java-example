package intern2018._netease;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 27/03/2018 20:07
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String directions = scanner.nextLine();
        if (n <= 0) {
            System.out.println("N");
            return;
        }
        if (directions.length() == 0) {
            System.out.println("N");
            return;
        }
        int L = 0;
        int R = 0;
        int f = 0;
        for (int i = 0; i < directions.length(); i++) {
            if (directions.charAt(i) == 'L') {
                f--;
            }else {
                f++;
            }
        }
        f = f % 4;
        if (f < 0) {
            f = f + 4;
        }
        String finalD = "NESW".charAt(f) +"";
        System.out.println(finalD);
    }
}
