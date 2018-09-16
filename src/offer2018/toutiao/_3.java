package offer2018.toutiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _3 {
    public static int restoreIpAddresses(String s) {
        List<String> combs = new ArrayList<>();
        if (s.length() < 4 || s.length() > 12) return combs.size();
        dfs(s, combs, "", 0, 0);
        return combs.size();
    }

    public static void dfs(String s, List<String> combs, String addr, int segm, int index) {
        if (segm >= 3) {
            String seg = s.substring(index);
            if (isValidSeg(seg)) {
                String ip = addr + seg;
                combs.add(ip);
            }
            return;
        }

        for (int i = 1; i < 4 && index+i < s.length(); i++) {
            String seg = s.substring(index, index+i);
            if (isValidSeg(seg)) {
                String ip = addr + seg + ".";
                dfs(s, combs, ip, segm+1, index+i);
            }
        }

    }

    public static  boolean isValidSeg(String str) {
        if (str.charAt(0) == '0' && str.length() > 1) return false;
        else if (Integer.valueOf(str) > 255) return false;
        else return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();

        System.out.println(restoreIpAddresses(s1));
    }


}


