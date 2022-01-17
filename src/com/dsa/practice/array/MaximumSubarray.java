/**
 * 
 */
package com.dsa.practice.array;

/**
 * 
 * <b>Leet Code - Problem 53<b> <br>
 * <br>
 * Given an integer array nums, find the contiguous subarray (containing at
 * least one number) which has the largest sum and return its sum. <br>
 * A subarray is a contiguous part of an array<br>
 * <br>
 * 
 * Example<br>
 * 
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]<br>
 * Output: 6<br>
 * Explanation: [4,-1,2,1] has the largest sum = 6.<br>
 * 
 * Constraints: <br>
 * 
 * 1 <= nums.length <= 10^5 <br>
 * -10^4 <= nums[i] <= 10^4 <br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class MaximumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MaximumSubarray practice = new MaximumSubarray();
		int[] nums = { -2, 1 };
		System.out.println(practice.maxSubArrayUsingBruteForce(nums));
		System.out.println(practice.maxSubArrayUsingBruteForceOptimized(nums));
	}

	/**
	 * This is also brute force solution but with O(n) complexity
	 * This is Kadane Algo - DP
	 * @param nums
	 * @return
	 */
	public int maxSubArrayUsingBruteForceOptimized(int[] nums) {
		int sum = 0, max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			sum = sum < 0 ? nums[i] : (sum + nums[i]);
			max = Math.max(sum, max);
		}
		return max;
	}

	/**
	 * This solution using Brute Force way to identify the maximum sum of contiguous
	 * sub array
	 * 
	 * Time Complexitiy - O(n^2)s
	 * 
	 * @param nums
	 * @return
	 */
	public int maxSubArrayUsingBruteForce(int[] nums) {

		// return only element if length is 1
		if (nums.length == 1) {
			return nums[0];
		}
		// assign max sum to first element
		int maxSum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				maxSum = Math.max(sum, maxSum);
			}
		}
		return maxSum;
	}

}
