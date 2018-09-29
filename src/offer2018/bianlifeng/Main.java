package offer2018.bianlifeng;

import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int a , b;
        LRUCache cache = new LRUCache(n);
        ArrayList<Integer> list = new ArrayList<>();

        while (s.hasNext()){
            list.add(s.nextInt());


        }

        for(int i = 0; i < list.size(); i+=2){
            a = list.get(i);
            if(i != list.size() - 1){
                b = list.get(i + 1);
                cache.put(a,b);
            } else {
                System.out.println(cache.get(a));

            }
        }

    }
}
class  LRUCache {
    private LinkedHashMap<Integer, Integer> map;
    private final int CAPACITY;
    public LRUCache(int capacity) {
        CAPACITY = capacity;
        map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > CAPACITY;
            }
        };
    }
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    public void put(int key, int value) {
        map.put(key, value);
    }
}