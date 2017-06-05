package string;

import java.util.HashMap;
import java.util.Stack;

public class LongestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
		System.out.println(new LongestPath().lengthLongestPath(s));
		System.out.println("\t\tfile.ext".lastIndexOf("\t"));
	}

    /**
     * @param input an abstract file system
     * @return return the length of the longest absolute path to file
     */
    public int lengthLongestPath(String input) {
        // Write your code here
    	if (input == null || input.equals("")){
    		return 0;
    	}
    	String[] s = input.split("\n");
    
    	int max = 0;
    	Stack<Integer> stack = new Stack<>();
    	stack.push(s[0].trim().length());
    	for (int i = 1; i < s.length; i++) {
    		String curDir = s[i];
    		int depth = curDir.lastIndexOf("\t") + 1;
    		curDir = curDir.substring(depth);
    		
    		while (stack.size() > depth) {
    			stack.pop();
    		}
    		int curLen = 0;
    		if (stack.size() > 0) {
    			curLen = stack.peek();
    		}
    		if (curDir.indexOf(".") > 0) {
    			max = Math.max(max, curLen + curDir.length() + depth);
    		} else if (stack.size() > 0) {
    			stack.push(stack.peek() + curDir.length());
    		}
    		
    	}
    	return max;
    }
    
    public boolean isFile(String file) {
    	if (file.indexOf(".") < 0) {
    		return false;
    	}
    	return true;
    }
    
}
