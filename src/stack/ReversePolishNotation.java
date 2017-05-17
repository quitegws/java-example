package stack;

import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] polish = {"4", "13", "5", "/", "+"};
		System.out.println(evalRPN(polish));

	}
    /**
     * @param tokens The Reverse Polish Notation
     * @return the value
     */
    public static int evalRPN(String[] tokens) {
        // Write your code here
//    	if (tokens == null || tokens.length == 0) {
//    		return -1;
//    	}
    	Stack<Integer> stack = new Stack<Integer>();
    	int len = tokens.length;
    	int tmp;
    	int args1;
    	int args2;
    	for (int i = 0; i < len; i++) {
    		if (tokens[i].equals("+")) {
    			args1 = stack.pop();
    			args2 = stack.pop();
    			tmp = args2 + args1;
    			stack.push(tmp);
    		} else if (tokens[i].equals("-")) {
    			args1 = stack.pop();
    			args2 = stack.pop();
    			tmp = args2 - args1;
    			stack.push(tmp);
    		} else if (tokens[i].equals("*")) {
    			args1 = stack.pop();
    			args2 = stack.pop();
    			tmp = args2 * args1;
    			stack.push(tmp);
    		}else if (tokens[i].equals("/")) {
    			args1 = stack.pop();
    			args2 = stack.pop();
    			tmp = args2 / args1;
    			stack.push(tmp);
    		}else {
    			stack.push(Integer.valueOf(tokens[i]));
    		}
    	}
    	return stack.pop();
    }

}
