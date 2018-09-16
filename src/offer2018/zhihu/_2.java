package offer2018.zhihu;

/**
 * @Author: gws
 * @Date: 09/09/2018 01:00
 * @Description:
 */
import java.util.Scanner;

public class _2{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        StringBuffer sb = new StringBuffer("");

        for(int i = 0; i < n; i++){
            a[i] = s.nextInt();
        }
        for(int j = 0; j < m; j++){
            b[j] = s.nextInt();
        }

        int i = 0, j = 0;
        while(i < n && j < m){
            if (a[i] < b[j]) {
                sb.append(a[i] + "->");
                i++;
            } else if (a[i] == b[j]) {
                sb.append(a[i] + "->");
                i++;
                j++;
            } else {
                sb.append(b[j] + "->");
                j++;
            }
        }

        while(i < n){
            if (i == n - 1) {
                sb.append(a[i]);

            } else {
                sb.append(a[i] + "->");
            }
            i++;
        }
        while(j < m){
            if (j == m - 1) {
                sb.append(b[j]);
            } else {
                sb.append(b[j] + "->");
            }
            j++;
        }
        int size = sb.length();
        String res = sb.toString();
        if (res.substring(size - 2).equals("->")){
            res = res.substring(0, size - 2);
        }
        System.out.println(res);
    }
}
