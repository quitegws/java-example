package offer2018.xiecheng;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 04/09/2018 19:24
 * @Description:
 */

// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        LRU lru = new LRU(n);
        while (in.hasNext()) {
            String pg = in.next();

            if (pg.equals("p")) {
                int key = in.nextInt();
                int value = in.nextInt();
                lru.put(key, value);
            } else {
                int key = in.nextInt();
                System.out.println(lru.get(key));
            }
        }

    }
}
class LRU{
    int size;
    public LRU(int size){
        this.size = size;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    HashMap<Integer, Integer> frq = new HashMap<>();
    PriorityQueue<Pair> p = new PriorityQueue<>(new Com());

    public void put(int key, int value){
        Integer k = Integer.valueOf(key);
        Integer v = Integer.valueOf(value);

        if (map.containsKey(k)) {
            map.put(k, v);
        } else {
            if (map.size() == size) {
                Integer least = p.poll().key;
                map.remove(least);
                Integer remove = frq.remove(least);
                p.remove(new Pair(k, remove));
            }
            map.put(k, v);
            frq.put(k, 1);
            p.add(new Pair(k,1));
        }
    }

    public int get(int key){
        Integer k = Integer.valueOf(key);

        if(map.containsKey(k)){
            int f = frq.get(k);
            frq.put(k, f + 1);
            p.remove(new Pair(k, f));
            p.add(new Pair(k, f+1));
            return map.get(k);
        } else {
            return -1;
        }
    }
}

class Com implements Comparator<Pair>{

    @Override
    public int compare(Pair o1, Pair o2) {
        return  o1.value - o2.value;
    }
}

class Pair{
    Integer key;
    Integer value;

    Pair(Integer key, Integer value){
        this.key = key;
        this.value = value;
    }

}