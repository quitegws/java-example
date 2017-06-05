package array;

public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int maxProfit2(int[] prices){
		int len = prices.length;
		int profit = 0;
		if (len <= 1) {
			return profit;
		}
		for (int i = 1; i < len; i++) {
			if (prices[i - 1] < prices[i]) {
				profit += prices[i] - prices[i - 1];
			}
		}
		return profit;
	}
	
	public static int maxProfit(int[] prices){
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int len = prices.length;
		
		int i = 0;
		int j = len - 1;
		int max = 0;
		
		while (i < j) {
			for (; i < j; i++) {
				if (prices[i] < prices[j]) {
					max = Math.max(max, prices[j] - prices[j]);
				}
			}
			j--;
			i = 0;
		}
		return max;
	}
	
	public static int maxProfit3(int[] prices){
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int len = prices.length;
		
		int min = Integer.MAX_VALUE;
		int j = len - 1;
		int max = 0;
		
		for (int price : prices) {
			min = Math.min(min, price);
			max = Math.max(max, price - min); 
		}
		return max;
	}
	
}
