package offer2018.yidian;

/**
 * @Author: gws
 * @Date: 29/09/2018 19:34
 * @Description:
 */
// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class _2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int index = 0;


        int[] array = new int[n];

        array[0] = in.nextInt();
        int result = array[0];
        int times = 1;

        for(int i=1;i<array.length;i++){
            array[i] = in.nextInt();
            if(times==0){
                result = array[i];
                times =1;
            }else if(array[i]==result)
                times++;
            else
                times--;
        }
        System.out.println(result);
    }
}