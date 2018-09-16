package offer2018.wangyihuyu;
// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
/**
 * @Author: gws
 * @Date: 08/09/2018 15:47
 * @Description:
 */
public class _1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0;i < n; i++){
            int N = in.nextInt();
            int M = in.nextInt();
            System.out.println(calc(N, M));
        }
    }
    public static int calc(int n, int m){
        //false up; true down
        boolean[][] card = new boolean[n][m];
        int res = 0;
        if(n <= 0 || m <= 0){
            return res;
        }
        for(int i = 0;i < n; i++){
            for(int j = 0; j < m; j++){

                if(i - 1 >= 0){
                    card[i - 1][j] = !card[i - 1][j];

                    if(j + 1 < m){
                        card[i - 1][j + 1] = !card[i - 1][j + 1];
                    }
                    if(j - 1 >= 0){
                        card[i - 1][j - 1] = !card[i - 1][j - 1];
                    }
                }
                if(j - 1 >= 0){
                    card[i][j - 1] = !card[i][j - 1];

                }
                card[i][j] = !card[i][j];
                if(i + 1 < n){
                    card[i + 1][j] = !card[i + 1][j];
                }
                if(j + 1 < m){
                    card[i][j + 1] = !card[i][j + 1];
                }

                if(i + 1 < n && j - 1 >= 0){
                    card[i + 1][j - 1] = !card[i + 1][j - 1];
                }
                if(i + 1 < n && j + 1 < m){
                    card[i + 1][j + 1] = !card[i + 1][j + 1];
                }
            }
        }

        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                if(card[i][j]){
                    res++;
                }
            }
        }

        return res;
    }
}

