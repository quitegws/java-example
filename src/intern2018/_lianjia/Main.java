package intern2018._lianjia;

import java.util.*;

/**
 * @Author: gws
 * @Date: 08/04/2018 19:27
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<Integer> set = new HashSet<Integer>(n);

        for(int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            for(int j = 0; j < k; j++) {
                set.add(scanner.nextInt());
            }
        }
        System.out.println(set.size());
    }
}
