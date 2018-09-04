package offer2018.xiecheng;
import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 04/09/2018 19:24
 * @Description:
 */

// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l = in.nextLong();
        int cnt = 0;

        while(l != 0){

            if ((l & 1) == 1) {
                cnt++;
            }
            l = l >>> 1;
        }

        System.out.println(cnt);
    }
}