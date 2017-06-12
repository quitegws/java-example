package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class GeneratePatentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utils.PrintUtils.printList(new GeneratePatentheses().generateParenthesis(4));
	}
    /**
     * @param n n pairs
     * @return All combinations of well-formed parentheses
     */
    public ArrayList<String> generateParenthesis(int n) {
        // Write your code here
    	ArrayList<String> result = new ArrayList<>();
    	if (n <= 0) {
    		return result;
    	}
    	result.add("()");
    	
    	while (n > 1) {
    		result = get(result);
    		n--;
    	}
    	HashSet<String> set = new HashSet<>();
    	for (String s : result) {
    		set.add(s);
    	}
    	return new ArrayList<String>(set);
    }
    
    public static ArrayList<String> get(ArrayList<String> prv){
    	ArrayList<String> next = new ArrayList<>();
    	if (prv == null || prv.size() == 0) {
    		return next;
    	}
    	for (String s : prv) {
    		next.add("(" + s + ")");
    		next.add("()" + s);
    		next.add(s + "()");
    	}
    	
    	return next;
    } 
    
}
