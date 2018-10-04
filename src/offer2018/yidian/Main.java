package offer2018.yidian;

// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dim = new int[n];
        for(int i = 0; i < n; i++){
            dim[i] = in.nextInt();
        }

        int[] dp = new int[n];


        for(int i = 3; i < n; i++){

            int len = dim[i];

            for(int j = i; j <= i + len; j++){
                dp[i] = Math.min(dp[i], dp[j] + 1);
            }


        }
        System.out.println(dp[n - 1]);
    }

    public static void f(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dim = new int[n];
        for(int i = 0; i < n; i++){
            dim[i] = in.nextInt();
        }

        int[] dp = new int[n];


        for(int i = 3; i < n;i++){
            int min = Integer.MAX_VALUE;

            for(int j = 3; j <= i; j++){
                if(dim[j - 1] >= i - j + 1){
                    min = Math.min(dp[j - 1] + 1, min);
                }
            }
            dp[i] = min;


        }
        System.out.println(dp[n - 1]);
    }
}