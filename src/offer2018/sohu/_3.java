package offer2018.sohu;

import scala.Int;

import java.util.Scanner;

public class _3{
    public static final int less = -1;
    public static final int equal = 0;
    public static final int bigger = 1;
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String v1 = s.next();
        String v2 = s.next();

        String[] v1s = v1.split("\\.");
        String[] v2s = v2.split("\\.");

        int len1 = v1s.length;
        int len2 = v2s.length;

        int i = 0;
        while(i < len1 && i < len2){
            int version1 = Integer.parseInt(v1s[i]);
            int version2 = Integer.parseInt(v2s[i]);
            if(version1 > version2){
                System.out.println(bigger);
                return;
            } else if (version1 < version2) {
                System.out.println(less);
                return;
            } else {
                i++;
            }
        }

        if (i < len1) {

            for(; i < len1; i++){
                if (Integer.parseInt(v1s[i]) != 0) {
                    System.out.println(bigger);
                    return;
                }
            }
            System.out.println(equal);
        } else if (i < len2) {
            for(; i < len2 ; i++){
                if (Integer.parseInt(v2s[i]) != 0) {
                    System.out.println(less);
                    return;
                }
            }
        } else {
            System.out.println(equal);
        }
    }
}
