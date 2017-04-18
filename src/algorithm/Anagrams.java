package algorithm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(anagram("asdfghjkl","lkjhgfdsa"));
//		for(int i =  0; i < 256; i++){
//			System.out.print((char)i + ", ");
//			if (i % 10 == 0) {
//				System.out.println();
//			}
//		}

	}
	
	public static boolean anagram(String s, String t){
		if (s.length() != t.length()) {
			return false;
		}
		int[] ascii = new int[256];
		
		for (int i = 0; i < s.length(); i++) {
			ascii[(int)s.charAt(i)]++;
		}
		for (int i  = 0; i < t.length(); i++) {
			ascii[(int)t.charAt(i)]--;
			if (ascii[(int)t.charAt(i)] < 0) {
				return false;
			}
		}
		
		return true;
	}
	
    public static boolean anagram1(String s, String t) {
        // write your code here
    	
    	if (s.length() != t.length() || s == null || t == null) {
    		return false;
    	}
    	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    	for (int i = 0; i < s.length(); i++) {
    		if (map.containsKey(s.charAt(i))) {
    			map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
    		} else {
    			map.put(s.charAt(i), 1);
    		}
    	}
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (map.containsKey(t.charAt(i))) {
    			if (map.get(t.charAt(i)) != 0) {
    				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
    			} else {
    				return false;
    			}
    		} else {
    			return false;
    		}
    	}
    	
    	for (Character i : map.keySet()) {
    		if (map.get(i) != 0) {
    			return false;
    		}
    	}
    	
    	return true;
    }

}
