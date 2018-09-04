package intern2018._lianjia;

import java.util.*;
/**
 * @Author: gws
 * @Date: 08/04/2018 19:35
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {

        System.out.println(triangle());
    }

    public static int triangle(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i + 1);
            dp[i] = i + 1;
        }
        return triangleCount(dp);
    }
    public static int tri(ArrayList<Integer> S){
        int iSize = S.size();
        if (iSize <= 2)
        {
            return 0;
        }
        int sum = 0;
        for (int i = 2; i < iSize; i++)
        {
            int posLeft = 0;
            int posRight = i - 1;
            int c = S.get(i);
            while (posLeft < posRight)
            {
                if (S.get(posLeft)+ S.get(posRight)<= c)
                    posLeft++;
                else if (S.get(posLeft)+ S.get(posRight) > c)
                {
                    sum += posRight - posLeft;
                    posRight--;
                }

            }
        }
        return sum;
    }

    public static int triangleCount(int[] S){
        int result = 0;
//        Arrays.sort(S);
        for (int i = 0; i < S.length; i++) {
            for (int j = i + 1; j < S.length; j++) {
                int l = i + 1;
                int r = j;
                int target = S[j] - S[i];
                while (l < r) {
                    int mid = (l + r) / 2;
                    if (S[mid] > target) {
                        r = mid;
                    } else {
                        l = mid + 1;
                    }

                }
                result += (j - l);
            }
        }
        return result;

    }
}
