/**
 * 
 */
package com.dsa.practice.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * <b>Leet Code - Problem 1<b> <br>
 * <br>
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.<br>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.<br>
 * You can return the answer in any order.<br>
 * <br>
 * 
 * Example<br>
 * 
 * Input: nums = [2,7,11,15], target = 9<br>
 * Output: [0,1]<br>
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].<br>
 * 
 * Constraints: <br>
 * 
 * 2 <= nums.length <= 10^4 <br>
 * -10^9 <= nums[i] <= 10^9 <br>
 * -10^9 <= target <= 10^9 <br>
 * Only one valid answer exists.<br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TwoSum practice = new TwoSum();
		int[] nums = { 2, 7, 11, 15 };
		System.out.println(Arrays.toString(practice.twoSumBruteForce(nums, 9)));
		System.out.println(Arrays.toString(practice.twoSum(nums, 9)));
	}

	/**
	 * 
	 * This is optimized algo to solve this problem
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				arr[0] = i;
				arr[1] = map.get(target - nums[i]);
				break;
			}
			map.put(nums[i], i);
		}
		return arr;
	}

	/**
	 * 
	 * This method uses Brute Force approach to solve the problem
	 * 
	 * Complexity - O(N^2)
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSumBruteForce(int[] nums, int target) {
		int[] arr = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					arr[0] = i;
					arr[1] = j;
				}
			}
		}
		return arr;
	}
}
