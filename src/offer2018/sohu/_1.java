package offer2018.sohu;

import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 13/09/2018 19:16
 * @Description:
 */
public class _1 {
    public static final int IS = 1;
    public static final int ISNOT = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();

        if (a.length() != b.length() || a.length() == 1) {
            System.out.println(ISNOT);
            return;
        }
//        if (a.equals(b)) {
//            System.out.println(IS);
//            return;
//        }

        int dif = 0;
        int dif1 = 0;
        int dif2 = 0;

        int n = a.length();
        boolean same = false;
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            if (ca[i] != cb[i]){

                dif++;
                if(dif == 1){
                    dif1 = i;
                } else if (dif == 2) {
                    dif2 = i;
                }
            } else {
                cnt[ca[i] - 'a']++;
            }
        }

        if (dif == 2) {
            swap(ca, dif2, dif1);
            String aa = String.valueOf(ca);
            if(aa.equals(b)){
                System.out.println(IS);
                return;
            } else{
                System.out.println(ISNOT);
                return;
            }
        } else if (dif == 0){
            for(int i = 0; i < 26;i++){
                if(cnt[i] >= 2) {
                    System.out.println(IS);
                    return;
                }
            }
        }
        System.out.println(ISNOT);

    }
    public static void swap(char[] c, int i, int j){
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
}
