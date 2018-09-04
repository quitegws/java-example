package intern2018._bear;

/**
 * @Author: bear
 * @Date: 08/05/2018 19:37
 * @Description:
 */
public class MaxProfit {

    public static int maxProfie(int[] prices, int p){
        int n = prices.length;
        int max = 0;
        int price = prices[0];

        int i = 1;
        while (i < n) {
            if (i + 1 < n && prices[i + 1] <= price) {
                i++;
                continue;
            }
            int curprofit = prices[i] - price - p;
            if (i + 1 < n && curprofit > 0) {
                max += curprofit;
                price = prices[++i];
            }
            else i++;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxProfie(new int[]{0,2,1,8,4,9}, 2));
    }
}
