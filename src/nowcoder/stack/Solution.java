package nowcoder.stack;

import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack stack = new Stack();
        int i = 0;
        int j = 0;
        while (i < pushA.length) {
            stack.push(pushA[i]);
            if (pushA[i] == popA[j]) {
                stack.pop();
                i++;
                j++;
            } else {
                i++;
            }
        }

        while (j < popA.length) {
            int t = (int) stack.pop();
            if (t != popA[j++]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,5,3,2,1};
        System.out.println(IsPopOrder(a,b));
    }
}