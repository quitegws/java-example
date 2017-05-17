package algorithm;

import java.util.HashSet;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    /**
     * @param str: a string
     * @return: a boolean
     */
    public static boolean isUnique(String str) {
        // write your code here
    	char[] chars = str.toCharArray();
    	HashSet<Character> set = new HashSet<Character>();
    	for(int i = 0; i < chars.length; i++){
    		if (!set.contains(chars[i])){
    			set.add(chars[i]);
    		} else {
    			return false;
    		}
    	}
    	return true;
    }

}
