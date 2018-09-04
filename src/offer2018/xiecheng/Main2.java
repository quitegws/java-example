package offer2018.xiecheng;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @Author: gws
 * @Date: 04/09/2018 19:24
 * @Description:
 */

// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = "null";

        int time = in.nextInt();
        PriorityQueue p = new PriorityQueue();

        for (int i = 0; i < n; i++) {
            int oid = in.nextInt();
            int bt = in.nextInt();
            int et = in.nextInt();

            if (bt <= time && et >= time) {
                p.add(Integer.valueOf(oid));
            }
        }

        int size = p.size();
        if(size == 0){
            System.out.println("null");
        }else {
            for (int i = 0; i < size; i++) {
                System.out.println(p.poll());
            }
        }
    }
}