package array;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * @Author: gws
 * @Date: 24/03/2018 14:43
 * @Description:
 */
public class GetMedian {
    LinkedList<Integer> list = new LinkedList<>();

    public void Insert(Integer num) {
        list.add(num);
        Collections.sort(list);
    }

    public Double GetMedian() {
        if (list.size() % 2  == 1) {
            return Double.valueOf(list.get(list.size() / 2));
        } else {
            Double d =  Double.valueOf(list.get((list.size() - 1 ) /2) + Double.valueOf(list.get(list.size()/2)));
            return d/2;
        }
    }
}
