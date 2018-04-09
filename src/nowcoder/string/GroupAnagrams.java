package nowcoder.string;

import java.util.*;

/**
 * @Author: gws
 * @Date: 23/03/2018 20:02
 * @Description:
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // write your code here
        Map<String, ArrayList<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] cs  = s.toCharArray();
            Arrays.sort(cs);
            String rs = String.valueOf(cs);
            map.putIfAbsent(rs, new ArrayList<String>());
            map.get(rs).add(s);
        }

        List<List<String>> list = new ArrayList<>();


        for(String s : map.keySet()){
            ArrayList<String> al = map.get(s);
            list.add(al);
            Collections.sort(al);
        }
        Collections.sort(list, new Comparator<List<String>>() {
            @Override
            public int compare(List<String> o1, List<String> o2) {
                if (o1.size() > o2.size()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        return list;
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(new GroupAnagrams().groupAnagrams(strs));
    }
}
