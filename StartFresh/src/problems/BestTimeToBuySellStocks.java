package problems;

public class BestTimeToBuySellStocks {


	    public static int maxProfit(int[] prices) {
	        int maxProfit = 0;

	        // Iterate through each day as buy day
	        for (int i = 0; i < prices.length; i++) {
	            // Iterate through each day after the buy day as sell day
	            for (int j = i + 1; j < prices.length; j++) {
	                // Calculate the profit by selling on the jth day after buying on ith day
	                int profit = prices[j] - prices[i];
	                // Update maxProfit if this profit is greater than seen before
	                if (profit > maxProfit) {
	                    maxProfit = profit;
	                }
	            }
	        }

	        return maxProfit;
	    }


	public static void main(String[] args) {
		int[] prices = {0,0,1,1,1,2,2,3,3,4} ;
		System.out.print(+maxProfit(prices));

	}
}
