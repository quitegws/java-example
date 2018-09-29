package offer2018.baicizhan;

// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
//14:52:11
//21:41:14

//204
//2454
//147258
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t1 = in.nextLine();
        String t2 = in.nextLine();

        String[] split1 = t1.split(":");
        String[] split2 = t2.split(":");

        int h1 = Integer.parseInt(split1[0]);
        int h2 = Integer.parseInt(split2[0]);

        int m1 = Integer.parseInt(split1[1]);
        int m2 = Integer.parseInt(split2[1]);

        int s1 = Integer.parseInt(split1[2]);
        int s2 = Integer.parseInt(split2[2]);



        int seconds = (h2 * 3600 + m2 * 60 + s2) - (h1 * 3600 + m1 * 60 + s1 ) ;


        double di = Double.valueOf(String.valueOf(seconds));


        double sa = di * 6D;
        double ma = (di / 60) * 6D;
        double ha = (di / 3600) * 30D;

        System.out.println(tostring(ha));
        System.out.println(tostring(ma));
        System.out.println(tostring(sa));
    }

    public static String tostring(double d){
        String s = "" + d;
        if(s.contains(".")){
            int index = s.indexOf(".");
            return s.substring(0, index);
        }else{
            return s;
        }
    }
}