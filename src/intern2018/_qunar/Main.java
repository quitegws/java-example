package intern2018._qunar;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 02/04/2018 15:20
 * @Description:
 */
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n <= 0 || m <= 0) {
            return;
        }
        LinkedList<Integer> list = new LinkedList<>();
        int[] seats = new int[n];
        for (int i = 0; i < n; i++) {
            seats[i] = scanner.nextInt();
            list.add(seats[i]);
        }

        if (helper(m, list)) {
            System.out.println("perfect");
        } else {
            System.out.println("good");
        }
    }

    public static boolean helper(int remaining, LinkedList<Integer> list1){
        if (remaining == 0 && list1.size() >= 0) {
            return true;
        }
        if (list1.size() == 0 && remaining != 0) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            int desire = list1.get(i);
            list1.remove(i);
            boolean flag = helper(remaining - desire, list1);
            if (flag) {
                return true;
            } else {
                list1.add(i, desire);
            }
        }
        return false;
    }
}
