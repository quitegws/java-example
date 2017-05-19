package string;

import java.util.HashMap;
import java.util.Map;

public class FirstPositionUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar2("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"));
	}

	public static int firstUniqChar2(String s){
    	if (s == null || s.length() == 0) {
    		return -1;
    	}
    	Map<Character, Integer> map = new HashMap<>();
    	int len = s.length();
    	for (int i = 0; i < len; i++) {
    		char c = s.charAt(i);
    		if (map.containsKey(c)) {
    			map.put(c, map.get(c) + 1);
    		} else {
    			map.put(c, 1);
    		}
    	}
    	for (int i = 0; i < len; i++) {
    		char c = s.charAt(i);
    		if (map.get(c) == 1) {
    			return i;
    		}
    	}
    	return -1;	
	}
	
	
    public static int firstUniqChar(String s) {
        // Write your code here
    	if (s == null || s.length() == 0) {
    		return -1;
    	}
    	
    	int len = s.length();
    	
    	for (int i = 0; i < len; i++) {
    		boolean flag = false;
    		char c = s.charAt(i);
    		for (int j = 0; j < len; j++) {
    			char c1 = s.charAt(j);
    			if (i != j && c == s.charAt(j)) {
    				flag = true;
    				break;
    			}
    		}
    		if (!flag) {
    			return i;
    		}
    	}
    	
    	return -1;
    }
}
//Given a string, find the first non-repeating character in it 
//and return it's index. If it doesn't exist, return -1.
//
//您在真实的面试中是否遇到过这个题？ Yes
//样例
//Given s = "lintcode", return 0.
//
//Given s = "lovelintcode", return 2.