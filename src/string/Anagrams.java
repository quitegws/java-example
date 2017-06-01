package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utils.PrintUtils.printList(anagrams(new String[]{"aaas","asaa"}));
		System.out.println();
	}
    public static int getHash(char[] count) {
        int hash = 0;
        int a = 378551;
        int b = 63689;
        for (int num : count) {
            hash = hash * a + num;
            a = a * b;
        }
        return hash;
    }
    
    public static List<String> anagrams(String[] strs) {
        // write your code here
    	List<String> list = new ArrayList<>();
    	Map<Integer, ArrayList<String>> map = new HashMap<>();
    	
    	for (String s : strs) {
    		char[] chars = s.toCharArray();
    		Arrays.sort(chars);
    		int hash = getHash(chars);
    		if (!map.containsKey(hash)) {
    			map.put(hash, new ArrayList<String>());
    		}
    		map.get(hash).add(s);
    	}
    	
    	for (ArrayList<String> l : map.values()) {
    		if (l.size() > 1) {
    			list.addAll(l);
    		}
    	}
    	
    	return list;
    }
}
