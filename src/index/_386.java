package index;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: gws
 * @Date: 16/08/2018 23:18
 * @Description:
 */
public class _386 {
    public static void main(String[] args) {
        new Solution().lexicalOrder(11);
    }
    static class Solution {
        public List<Integer> lexicalOrder(int n) {
            List<Integer> result = new ArrayList<>(n);

            for (int i = 1; i <= n; i++) {
                result.add(i);
            }

            Collections.sort(result, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {

                    return String.valueOf(o1).compareTo(String.valueOf(o2));
                }
            });


            utils.PrintUtils.printList(result);
            return  result;
        }
    }
}
