package intern2018._jd;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(find(s));
    }


    private static long find(String s) {
        int len = s.length();
        char[] str = s.toCharArray();
        long[][] dp = new long[len][len];
        for(int j=0;j<len;j++){
            dp[j][j]=1;
            for(int i=j-1;i>=0;i--){
                dp[i][j]=dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1];
                if(str[i]==str[j])
                    dp[i][j]+=1+dp[i+1][j-1];
            }
        }
        return dp[0][len-1];
    }
    static int countPS(String str)
    {
        int N = str.length();

        // create a 2D array to store the count
        // of palindromic subsequence
        int[][] cps = new int[N+1][N+1];

        // palindromic subsequence of length 1
        for (int i = 0; i < N; i++)
            cps[i][i] = 1;

        // check subsequence of length L is
        // palindrome or not
        for (int L=2; L<=N; L++)
        {
            for (int i = 0; i < N; i++)
            {
                int k = L + i - 1;
                if (k < N){
                    if (str.charAt(i) == str.charAt(k))
                        cps[i][k] = cps[i][k-1] +
                                cps[i+1][k] + 1;
                    else
                        cps[i][k] = cps[i][k-1] +
                                cps[i+1][k] -
                                cps[i+1][k-1];
                }
            }
        }

        // return total palindromic subsequence
        return cps[0][N-1];
    }
}