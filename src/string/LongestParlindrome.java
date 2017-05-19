package string;

import java.util.HashMap;
import java.util.Map;

public class LongestParlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abccccdd";
		System.out.println(s + "\n" +longestPalindrome(s));
	}
    /**
     * @param s a string which consists of lowercase or uppercase letters
     * @return the length of the longest palindromes that can be built
     */
    public static int longestPalindrome(String s) {
        // Write your code here
    	if (s == null) {
    		return 0;
    	}
    	if (s.length() <= 1) {
    		return s.length();
    	}
    	
    	int len = s.length();
    	boolean hasOdd = false;
    	int result = 0;
    	Map<Character, Integer> map = new HashMap<>();
    	for (int i = 0; i < len; i++) {
    		char c = s.charAt(i);
    		if (map.containsKey(c)) {
    			map.put(c, map.get(c) + 1);
    		} else {
    			map.put(c, 1);
    		}
    	}
    	for (Character key : map.keySet()) {
    		int cnt = map.get(key);
    		if (cnt % 2 == 0) {
    			result += cnt;
    		} else {
    			if (hasOdd) {
    				result += cnt - 1;
    			} else {
    				result += cnt;
    			}
    			hasOdd = true;
    		}
    	}
    	return result;
    }
    

}
