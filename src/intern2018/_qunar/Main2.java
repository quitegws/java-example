package intern2018._qunar;

import java.util.*;

/**
 * @Author: gws
 * @Date: 02/04/2018 16:00
 * @Description:
 */
public class Main2 {

    public static int path = 0;
    public static String rev;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        rev = new StringBuilder(s).reverse().toString();
        String target = s;
        String lines = scanner.nextLine();
        String[] split = lines.split("\\s+");

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < split.length; i++) {
            list.add(split[i]);
        }
        helper(list, target);

        System.out.println(path);
    }

    public static boolean helper(LinkedList<String> list, String target){
        if (target.equals(rev)) {
            return true;
        }

        if (list.size() ==  0 ) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (xl(s,target) == true) {
                target = s;
                list.remove(i);
                path++;
                if (!helper(list, target)){
                    path--;
                    list.add(i, s);
                }
            }
        }

        return false;
    }



    public static boolean xl(String s1, String s2){
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                sum ++;
            }
        }
        if(sum == 1){
            return true;
        } else{
            return false;
        }
    }
}
