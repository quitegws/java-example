package test;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * @Author: gws
 * @Date: 16/09/2018 15:41
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(2,13);
        treeMap.put(13,2);
        treeMap.put(21,3);
        treeMap.put(22,13);
        treeMap.put(1,13);

        treeMap.forEach((k,v)-> System.out.println(k + " : " + v));


    }

}
