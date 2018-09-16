package offer2018.di4fanshi;

// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();

        String res = multi(a);

        System.out.println(res);
    }

    public static String multi(String a){
        if (a == null || a.length() <= 1) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        int i = 0;
        while(i < a.length()){
            sb.append(a.charAt(i++));
            sb.append("#");
        }
        String str = sb.toString();

        int max = 0;
        String res = "";
        StringBuilder tmp = new StringBuilder();
        for(i = 1; i < str.length(); i++) {
            int l = i - 1;
            int h = i + 1;
            if (str.charAt(i) != '#') {
                tmp.append(str.charAt(i));
            }
            while(l >= 0 && h < str.length()) {
                char cl = sb.charAt(l);
                char ch = sb.charAt(h);
                if (cl == ch) {
                    if (cl != '#') {
                        tmp.insert(0,cl);
                    }
                    if(ch != '#'){
                        tmp.append(ch);
                    }
                    l--;
                    h++;
                } else {
                    l++;
                    h--;
                    break;
                }
            }
            if (max < tmp.length()) {
                max = tmp.length();
                res = tmp.toString();
            }

            tmp = new StringBuilder();
        }

        return res;
    }
}