/**
 * 
 */
package com.dsa.practice.array;

/**
 * 
 * <b>Leet Code - 121. Best Time to Buy and Sell Stock<b> <br>
 * <br>
 * You are given an array prices where prices[i] is the price of a given stock
 * on the ith day.<br>
 * 
 * You want to maximize your profit by choosing a single day to buy one stock
 * and choosing a different day in the future to sell that stock.<br>
 * 
 * Return the maximum profit you can achieve from this transaction. If you
 * cannot achieve any profit, return 0. <br>
 * 
 * Example<br>
 * 
 * Input: <br>
 * prices = [7,1,5,3,6,4]<br>
 * Output: 5<br>
 * Explanation: <br>
 * Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.<br>
 * Note that buying on day 2 and selling on day 1 is not allowed because you
 * must buy before you sell. <br>
 * <br>
 * Constraints: <br>
 * 
 * 1 <= prices.length <= 10^5 <br>
 * 0 <= prices[i] <= 10^4 <br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class BestTimetoBuyandSellStock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BestTimetoBuyandSellStock practice = new BestTimetoBuyandSellStock();
		int[] num = { 7, 6, 4, 3, 1 };
		System.out.println(practice.maxProfitBruteForce(num));
		System.out.println(practice.maxProfit(num));
	}

	/**
	 * 
	 * This is simple Brute Force Example with O(N^2) completxity
	 * 
	 * @param prices
	 * @return
	 */
	public int maxProfitBruteForce(int[] prices) {
		int maxProfit = 0;
		if (prices.length == 1) {
			return prices[0];
		}
		for (int i = 0; i < prices.length; i++) {
			for (int j = i; j < prices.length; j++) {
				maxProfit = Math.max(prices[j] - prices[i], maxProfit);
			}
		}
		return maxProfit;
	}

	/**
	 * 
	 * Dynamic Programming - Optimised Solution
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
		int min = prices[0];
		int max = 0; // initially profit is 0

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min)
				min = prices[i];
			else if (prices[i] - min > max)
				max = prices[i] - min;
		}

		return max;

	}

}
