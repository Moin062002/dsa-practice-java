package com.ex2;

public class BuyAndSellStock {
	public static int buyAndSellStock(int[] price) {
		int maxProfit = 0;
		int profit = 0;
		int buy = Integer.MAX_VALUE;
		for(int i=0 ; i<price.length ; i++) {
			if(buy < price[i]) {  // profit
				profit = price[i] - buy;  // todays price
				maxProfit = Math.max(maxProfit, profit);
			} else {
				buy = price[i];
			}
		}
		return maxProfit;
	}
	
//	int	minPrice = price[0];
//	int ans = 0;
//	for(int i=1 ; i<price.length ; i++) {
//		int curr = price[i] - minPrice;
//		ans = Math.max(ans, curr);
//		minPrice = Math.min(minPrice, price[i]);
//	}
//	return ans;
//}
	public static void main(String[] args) {
		int price[] = {7,1,5,3,6,4};
		System.out.println(buyAndSellStock(price));
	}
}