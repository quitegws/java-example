package list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: gws
 * @Date: 18/04/2018 10:51
 * @Description:
 */
public class PascaTriangle {
    public static void main(String[] args) {
        System.out.println(generate(6));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            res.add(getLine(i + 1));
        }
        return res;
    }

    public static List<Integer> getLine(int n){
        if (n <= 0) return null;
        ArrayList<Integer> list = new ArrayList<>(n);
        if (n == 1) {list.add(1); return list;}
        if (n == 2) {list.add(1);list.add(1);return list;}

        List<Integer> last = getLine(n - 1);

        for (int i = 0; i < n ; i++) {
            int last1 = i - 1 < 0 ? 0 : last.get(i - 1);
            int last2 = i >= last.size() ? 0 : last.get(i);
            list.add(i,last1 + last2);
        }

        return list;
    }
}
