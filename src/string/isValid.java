package string;

import java.util.LinkedList;

/**
 * @Author: gws
 * @Date: 18/04/2018 10:28
 * @Description:
 */
public class isValid {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println('}' - '{');
    }

    public static boolean isValid(String s) {
        if (s == null || s.equals("")) return false;
        LinkedList<Character> stack = new LinkedList<Character>();
        char[] chars = s.toCharArray();
        if (chars.length % 2 == 1) return false;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (!stack.isEmpty() ) {
                    char cc = stack.peek();
                    if ((c == '}' && cc == '{') || (c == ']' && cc == '[') || (c == ')' && cc == '(')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) return true;
        else return false;
    }
}
