package math;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gws
 * @Date: 04/04/2018 16:03
 * @Description:https://leetcode.com/problems/perfect-squares/description/
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.

Credits:
Special thanks to @jianchao.li.fighter for adding this problem and creating all test cases.


 */
public class PerfectSquares {
    public static  List<Integer> generateSquareList(int n) {
        List<Integer> squareList = new ArrayList<>();
        int diff = 3;
        int square = 1;
        while (square <= n) {
            squareList.add(square);
            System.out.println(square);
            square += diff;
            diff += 2;
        }
        return squareList;
    }

    public static void main(String[] args) {
        generateSquareList(101);
    }

}
