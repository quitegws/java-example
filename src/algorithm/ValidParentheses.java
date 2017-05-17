package algorithm;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValidParentheses("}}}{{{"));
		System.out.println(Math.abs('{' - '}'));

	}
	
    public static boolean isValidParentheses(String s) {
        // Write your code here
    	if (s == null || s.length() == 0 || s.length() % 2 == 1) {
    		return false;
    	}
    	Stack<Character> stack = new Stack<Character>();
    	char[] chars = s.toCharArray();
    	for (int i = 0; i < s.length(); i++) {
    		
    		if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
    			stack.push(chars[i]);
    		} else if (chars[i] == ')' || chars[i] == ']' || chars[i] == '}') {
    			char c;
    			if (!stack.empty()) {
    				c = stack.pop();
    			} else {
    				return false;
    			}
    			if (Math.abs(c - chars[i]) > 2) {
    				return false;
    			}
    		} else {
    			return false;
    		}
    		
    	}
    	if (!stack.empty()) {
    		return false;
    	}
    	return true;
    }

}
