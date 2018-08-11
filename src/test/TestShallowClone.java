package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: gws
 * @Date: 08/08/2018 23:31
 * @Description:
 */
public class TestShallowClone {
    public static void main(String[] args) {
        HashMap<String,A> map = new HashMap<>();

        A a = new A();
        A b = new A();
        map.put("1",a);
        map.put("2",b);

        HashMap<String,A> clone = (HashMap<String, A>) map.clone();
        System.out.println(clone.get("2"));
        System.out.println(map.get("2"));

    }
}

class A{}