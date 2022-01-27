/**
 * 
 */
package com.dsa.practice.array;

import java.util.Arrays;

/**
 * 
 * <b>Leet Code - 215. Kth Largest Element in an Array<b> <br>
 * <br>
 * Given an integer array nums and an integer k, return the kth largest element
 * in the array. <br>
 * Note that it is the kth largest element in the sorted order, not the kth
 * distinct element.<br>
 * <br>
 * 
 * Example<br>
 * 
 * Input: <br>
 * Input: nums = [3,2,1,5,6,4], k = 2<br>
 * Output: 5 <br>
 * 
 * Constraints: <br>
 * 
 * 1 <= k <= nums.length <= 10^4 <br>
 * -10^4 <= nums[i] <= 10^4 <br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class KthLargestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		KthLargestElement practice = new KthLargestElement();
		int[] nums = { 7, 10, 4, 3, 20, 15 };
		System.out.println(practice.findKthLargestElement(nums, 3));
		System.out.println(practice.findKthSmallestElement(nums, 3));
	}

	/**
	 * This is simple brute force solution
	 * 
	 * @param nums
	 * @param k
	 * @return kth largest element
	 */
	public int findKthLargestElement(int[] nums, int k) {
		if (nums.length == 0) {
			return -1;
		}
		// if only one element, sent that value
		if (nums.length == 1 && k == 1) {
			return nums[0];
		}
		// sort the array
		Arrays.sort(nums);
		// return the kth largest element
		return nums[nums.length - k];
	}

	/**
	 * This return smallest kth element
	 * 
	 * @param nums
	 * @param k
	 * @return kth largest element
	 */
	public int findKthSmallestElement(int[] nums, int k) {
		if (nums.length == 0) {
			return -1;
		}
		// if only one element, sent that value
		if (nums.length == 1 && k == 1) {
			return nums[0];
		}
		// sort the array
		Arrays.sort(nums);
		// return the kth largest element
		return nums[k - 1];
	}

}
