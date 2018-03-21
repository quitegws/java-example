import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 20/03/2018 20:00
 * @Description:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        char[] chars = line.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int size = map.size();
        StringBuilder sb = new StringBuilder("");

        String max = line;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (map.get(c) == 1) {
                sb.append(c);
            } else if (0==0) {

            }
        }

        System.out.println(max);

//        System.out.println("b".compareTo("aafad")>0);
    }

    public static int size(String s){
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char c : chars) {
            set.add(c);
        }
        return set.size();
    }
}
