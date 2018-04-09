package _jd;
import java.util.*;

/**
 * @Author: gws
 * @Date: 09/04/2018 19:51
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i < k; i++){
            System.out.println(f(scanner.nextLine()));
        }
    }

    public static String f(String p) {
        Stack<Character> stack = new Stack<>();
        String result = "No";
        if(p == null || p.equals("") || p.equals("()") ) return result;
        char[] chars = p.toCharArray();
        int even = 0;
        for(char c : chars){
            if(c == '('){
                even++;
            } else {
                even--;
            }
        }
        if(even != 0) return result;

        int len = chars.length;
        int match = 2;

        for (int i = 0; i < len; i++) {
            char c = chars[i];
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    match--;
                } else {
                    stack.pop();
                }
            }
        }

        if (match == 1 && stack.size() == 1 && stack.peek() == '(') {
            result = "Yes";
        }
        if (match == 2) result = "Yes";
        return result;
    }
}
