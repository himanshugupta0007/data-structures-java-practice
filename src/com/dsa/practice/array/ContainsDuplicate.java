/**
 * 
 */
package com.dsa.practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * 
 * <b>Leet Code - Problem 217<b> <br>
 * <br>
 * Contain Duplicate Given an integer array nums, return true if any value
 * appears at least twice in the array, and return false if every element is
 * distinct.<br>
 * <br>
 * 
 * Example<br>
 * 
 * Input: <br>
 * nums = [1,2,3,1]<br>
 * Output: true<br>
 * <br>
 * 
 * Constraints: <br>
 * 
 * 1 <= nums.length <= 10^5 <br>
 * -10^9 <= nums[i] <= 10^9 <br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class ContainsDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ContainsDuplicate practice = new ContainsDuplicate();
		int[] nums = { 1, 3, 4, 2, 5, 1, 3, -1, 3 };
		System.out.println("Using HashSet :" + practice.containsDuplicateUsingSet(nums));
		System.out.println("Using HashMap :" + practice.containsDuplicateUsingHashMap(nums));
		System.out.println("Using HashMap :" + practice.containsDuplicateUsingBitmanipulation(nums));
	}

	/**
	 * 
	 * This method uses HashSet to identify if there is any duplicate elements is
	 * present
	 * 
	 * @param nums
	 * @return
	 */
	private boolean containsDuplicateUsingSet(int[] nums) {

		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer integer : nums) {
			// set will return false if we try to add duplicate elements
			if (!set.add(integer)) {
				// break the flow as soon as you will find the duplicate element
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * Using HashMap: Add array element as a key and check if key is already present
	 * on not
	 * 
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicateUsingHashMap(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			// break the flow and return true if key is already present
			if (map.containsKey(nums[i])) {
				return true;
			} else {
				map.put(nums[i], 1);
			}
		}
		return false;
	}

	/**
	 * Using Bit manipulation: Sort the error and use XOR operator to check if
	 * duplicate element is present
	 * 
	 * @param nums
	 * @return
	 */
	public boolean containsDuplicateUsingBitmanipulation(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			// XOR of same number always returns 0
			if ((nums[i] ^ nums[i + 1]) == 0) {
				return true;
			}
		}

		return false;
	}

}
