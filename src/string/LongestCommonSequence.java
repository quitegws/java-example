package string;

/**
 * @Author: gws
 * @Date: 23/03/2018 21:59
 * @Description:
 */
public class LongestCommonSequence {
    public static void main(String[] args) {
        System.out.println(longestCommonSequence("abc","acd"));
    }

    public static int longestCommonSequence(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        int n = chars1.length;
        int m = chars2.length;
        int[][] f = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                f[i][j] = Math.max(f[i - 1][j],f[i][j - 1]);
                if(chars1[i - 1] == chars2[j - 1]){
                    f[i][j] = f[i - 1][j - 1] + 1;
                }
            }
        }
        return f[n][m];
    }
}
