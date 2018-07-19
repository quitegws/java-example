package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: gws
 * @Date: 06/05/2018 22:06
 * @Description:
 */
public class ShortestToChar {
    public static void main(String[] args) {
        ShortestToChar shortestToChar = new ShortestToChar();
        int[] res = shortestToChar.shortestToChar("loveleetcodel",'e');
        utils.PrintUtils.printArray(res,"res");
    }
    public int[] shortestToChar(String S, char C) {
        int len = S.length();
        int[] res = new int[len];
        Arrays.fill(res, Integer.MAX_VALUE);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < len; i++){
            char c = S.charAt(i);
            if (c == C) list.add(i);
        }

        int listSize = list.size();
        for (int k = 0; k < list.size(); k++) {
            int index = list.get(k);
            int last = k == 0 ? 0 : list.get(k - 1);
            int next = k == listSize - 1 ? len - 1 : list.get(k + 1);

            int i = 1;
            res[index] = 0;
            while (index + i <= next || index - i >= last) {
                if (index + i <= next) {
                    res[index + i] = Math.min(res[index + i], i);
                }
                if (index - i >= last) {
                    res[index - i] = Math.min(res[index - i], i);
                }
                i++;
            }
        }
        return res;
    }
}
