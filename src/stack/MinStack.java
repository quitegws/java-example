package stack;

import java.util.Stack;

public class MinStack {
    
	Stack<Integer> stack;
    public MinStack() {
        // do initialize if necessary
    	stack  = new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
    	stack.push(number);
    	
    }

    public int pop() {
        // write your code here
    	return stack.pop();
    }

    public int min() {
        // write your code here
    	Stack<Integer> tmp = new Stack<Integer>();
    	int min = Integer.MAX_VALUE;
    	int cur;
    	while (!stack.empty()) {
    		cur = stack.pop();
    		min = Math.min(min, cur);
    		tmp.push(cur);
    	}
    	while (!tmp.empty()) {
    		stack.push(tmp.pop());
    	}
    	return min;
    }
}
