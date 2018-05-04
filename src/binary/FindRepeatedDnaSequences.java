package binary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: gws
 * @Date: 23/04/2018 19:39
 * @Description: leetcode no.187 https://leetcode-cn.com/problems/repeated-dna-sequences/description/
 */
public class FindRepeatedDnaSequences {
    public static void main(String[] args) {
        FindRepeatedDnaSequences findRepeatedDnaSequences = new FindRepeatedDnaSequences();
        System.out.println(findRepeatedDnaSequences.findRepeatedDnaSequences("GAGAGAGAGAGA"));
        System.out.println(0xfffff & 1);
    }

    public List<String> findRepeatedDnaSequences(String s) {

        Map<Character, Integer> map = new HashMap<>();
        Map<Integer , Integer> subStringMap = new HashMap<>();
        List<String>  list = new ArrayList<>();
        if (s == null || s.length() < 10) return list;

        map.put('A', 0);
        map.put('T', 1);
        map.put('C', 2);
        map.put('G', 3);

        int tmp = map.get(s.charAt(0));

        for (int i = 1; i < 10; i++) {
            char c = s.charAt(i);
            int code = map.get(c);
            tmp <<= 2;
            tmp |= code;
        }
        subStringMap.put(tmp,1);

        for (int i = 10; i < s.length(); i++) {
            tmp <<= 2;
            tmp |= map.get(s.charAt(i));
            tmp &= 0xfffff;

            Integer value = subStringMap.get(tmp);
            if (value != null && value == 1) {
                list.add(s.substring(i - 9, i + 1));
                subStringMap.put(tmp, value + 1);
            } else if (value == null){
                subStringMap.put(tmp,1);
            }
        }

        return list;

    }
}
