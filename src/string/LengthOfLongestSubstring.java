package string;

import java.util.HashMap;
import java.util.HashSet;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabcdd";
		String s1 = "gehmbfqmozbpripibusbezagafqtypz";
		System.out.println(lengthOfLongestSubstring(s));
	}
    /**
     * @param s: a string
     * @return: an integer 
     */
    public static int lengthOfLongestSubstring(String s) {
        // write your code here
	    	if (s == null || s.length() == 0) {
	    		return 0;
	    	}
	    	int len = s.length();
	    	HashSet<Character> set = new HashSet<>();
	    	HashMap<Character, Integer> map = new HashMap<>();
	    	char[] chars = s.toCharArray();
	    	int max = Integer.MIN_VALUE;
	    	int k = 0;
	    	for (int i = 0; i < len; i++) {
	    		char c = chars[i];
	    		if (map.containsKey(c)) {
	    			int c1 = map.get(c);
	    			max = Math.max(max, i - k);
	    			if (c1 >= k) {
	    				k = c1 + 1;
	    			}
	    			map.put(c, i);
	    		} else {
	    			map.put(c, i);
	    			max = Math.max(max, i - k + 1);
	    		}
	    	}
	    	
	    	return max;
    }
}
