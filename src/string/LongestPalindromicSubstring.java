package string;

import java.util.HashMap;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("abcfcbaa"));
		System.out.println(longestPalindrome("aabccbaa"));
		System.out.println("avc".substring(0, 3));
	}
    /**
     * @param s input string
     * @return the longest palindromic substring
     */
    public static String longestPalindrome(String s) {
        // Write your code here
    		if (s == null || s.equals("")) {
    			return "";
    		}
    		char[] values = s.toCharArray();
    		int len = values.length;
    		HashMap<Integer, Character> map = new HashMap<>();
    		for (int i = 0; i < len; i++) {
    			map.put(i, values[i]);
    		}
    		
    		int max = 0;
    		String result = "";
    		for (int i = 0; i < len; i++) {
    			for (int j = i; j < len; j++) {
    				if (max > j - i + 1) {
    					continue;
    				}
    				boolean tmp = isPalindrome(s.substring(i, j + 1));
    				if (tmp) {
    					if (max < j - i + 1) {
    						result = s.substring(i, j + 1);
    						max = j - i + 1;
    					}
//    					max = Math.max(max, j - i + 1);
    				}
    			}
    		}
    		return result;
    }
    
    public static boolean isPalindrome(String s){
    		if (s == null || s.equals("")) {
    			return false;
    		}
    		int len = s.length();
    		if (s.length() == 1) {
    			return true;
    		}
    		char[] values = s.toCharArray();
    		int i = 0;
    		int j = len - 1;
    		while (i <= len - 1 && i < j && j >= 0) {
    			if (values[i] == values[j]) {
    				i++;
    				j--;
    				continue;
    			}
    			return false;
    		}
    		return true;
    }
}
