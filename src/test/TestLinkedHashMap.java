package test;

import java.util.*;

/**
 * @Author: gws
 * @Date: 29/04/2018 00:17
 * @Description:
 */
public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, List<String>> map = new LinkedHashMap<>(16,0.75f,false);

        map.put(1,new ArrayList<>());
        map.put(2,new ArrayList<>());
        map.put(3,new ArrayList<>());

        System.out.println(map);

    }
}
