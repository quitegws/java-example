package stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class ToPolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("12120210".matches("^[1-9]{1,}[0-9]{0,}$"));
		String[] expression = {"2","*","6","-","(","23","+","7",")","/","(","1","+","2",")"};
		//["2","6","*","23","7","+","1","2","+","/","-"]
		utils.PrintUtils.printList(convertToRPN(expression));
	}


    /**
     * @param expression: A string array
     * @return: The Reverse Polish notation of this expression
     */
    public static ArrayList<String> convertToRPN(String[] expression) {
        // write your code here
    	ArrayList<String> list = new ArrayList<String>();
    	Stack<String> operators = new Stack<String>();
    	operators.push("#");
    	HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("-", 1);
		map.put("+", 1);
		map.put("*", 2);
		map.put("/", 2);
		map.put("#", 0);
    	if (expression == null || expression.length == 0) {
    		return list;
    	}
    	for (int i = 0; i < expression.length; i++) {
    		if (expression[i].matches("^[1-9]{1,}+[0-9]{0,}$")) {
    			list.add(expression[i]);
    		} else {
    			if (expression[i].equals("(")) {
        			operators.push(expression[i]);
        		} else if (expression[i].equals(")")) {
        			String tmp;
        			while ((tmp = operators.pop()) != "(" && tmp != null) {
        				list.add(tmp);
        			}
        		} else if (operators.peek().equals("(")) {
        			operators.push(expression[i]);
        		} else if (map.get(expression[i]) > map.get(operators.peek())) {
        			operators.push(expression[i]);
        		} else  {
        			do{
        				String tmp;
        				tmp = operators.pop();
        				list.add(tmp);
        			}while (!operators.peek().equals("(") && map.get(expression[i]) <= map.get(operators.peek()));
        			operators.push(expression[i]);
        		}
    		}
    	}
    	while (!operators.empty()) {
    		String operator = operators.pop();
    		if (!operator.equals("#")) {
    			list.add(operator);
    		}
    	}
    	
    	return list;
    }
}
