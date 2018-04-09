package string;

/**
 * @Author: gws
 * @Date: 23/03/2018 21:32
 * @Description:
 */
public class LongestCommonSubstring {
    public static void main(String[] args) {
        System.out.println(longestCommonSubstring2("adda","aadf"));
    }

    public static int longestCommonSubstring(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        int n = chars1.length;
        int m = chars2.length;

        int[][] f = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (chars1[i -  1] == chars2[j - 1]) {
                    f[i][j] = f[i - 1][j - 1] + 1;
                }
            }
        }

        int max = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                max = Math.max(f[i][j], max);
            }
        }
        return max;

    }

    public static int longestCommonSubstring2(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();

        int n = chars1.length;
        int m = chars2.length;

        int max = 0;

        int[][] f = new int[n + 1][m + 1];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                int cur = 0;
                while(i + cur < n && j + cur < m && chars1[i + cur] == chars2[j + cur]){
                    cur++;
                }
                max = Math.max(max, cur);
            }
        }
        return max;
    }

}
