package stack;

import java.util.Stack;

public class MyQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
       // do initialization if necessary
    	stack1 = new Stack<Integer>();
    	stack2 = new Stack<Integer>();
    }
    
    public void push(int element) {
        // write your code here
    	stack1.push(element);
    }

    public int pop() {
        // write your code here
    	while (!stack1.empty()) {
    		stack2.push(stack1.pop());
    	}
    	int pop =  stack2.pop();
    	while (!stack2.empty()) {
    		stack1.push(stack2.pop());
    	}
    	return pop;
    }

    public int top() {
        // write your code here
    	while (!stack1.empty()) {
    		stack2.push(stack1.pop());
    	}
    	int top =  stack2.peek();
    	while (!stack2.empty()) {
    		stack1.push(stack2.pop());
    	}
    	return top;
    }
}
