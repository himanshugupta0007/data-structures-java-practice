/**
 * 
 */
package com.dsa.practice.array;

/**
 * 
 * <b>Leet Code - 1672. Richest Customer Wealth<b> <br>
 * <br>
 * You are given an m x n integer grid accounts where accounts[i][j] is the
 * amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​
 * bank. Return the wealth that the richest customer has.<br>
 * <br>
 * 
 * A customer's wealth is the amount of money they have in all their bank
 * accounts. The richest customer is the customer that has the maximum
 * wealth.<br>
 * <br>
 * 
 * Example<br>
 * 
 * Input: <br>
 * accounts = [[1,2,3],[3,2,1]]<br>
 * Output: 6<br>
 * Explanation:<br>
 * 1st customer has wealth = 1 + 2 + 3 = 6 <br>
 * 2nd customer has wealth = 3 + 2 + 1 = 6 <br>
 * Both customers are considered the richest with a wealth of 6 each, so return
 * 6.
 * 
 * <br>
 * 
 * Constraints: <br>
 * 
 * m == accounts.length <br>
 * n == accounts[i].length <br>
 * 1 <= m, n <= 50 <br>
 * 1 <= accounts[i][j] <= 100 <br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class RichestCustomerWealth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RichestCustomerWealth practice = new RichestCustomerWealth();
		int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
		System.out.println(practice.maximumWealth(accounts));
	}

	/**
	 * This returns the maximum wealth of account
	 * 
	 * @param accounts
	 * @return
	 */
	public int maximumWealth(int[][] accounts) {

		int maxSum = 0;
		// number of rows
		int customers = accounts.length;
		// number of columns
		int account = accounts[0].length;
		for (int i = 0; i < customers; i++) {
			int sum = 0;
			for (int j = 0; j < account; j++) {
				sum += accounts[i][j];
			}
			maxSum = Math.max(sum, maxSum);
		}
		return maxSum;
	}
}
