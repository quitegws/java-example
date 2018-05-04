package test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author: gws
 * @Date: 29/04/2018 00:17
 * @Description:
 */
public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>(16,0.75f,false);

        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        System.out.println(map);

    }
}
