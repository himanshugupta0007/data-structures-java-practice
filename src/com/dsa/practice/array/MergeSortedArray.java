/**
 * 
 */
package com.dsa.practice.array;

import java.util.Arrays;

/**
 * 
 * <b>Leet Code - 88. Merge Sorted Array <br>
 * 
 * <br>
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively.<br>
 * <br>
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.<br>
 * <br>
 * 
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1. To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and
 * the last n elements are set to 0 and should be ignored. nums2 has a length of
 * n <br>
 * <br>
 * 
 * Example<br>
 * <br>
 * 
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3<br>
 * Output: [1,2,2,3,5,6]<br>
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6]. The result of
 * the merge is [1,2,2,3,5,6] with the underlined elements coming from
 * nums1.<br>
 * 
 * Constraints: <br>
 * <br>
 * 
 * <ul>
 * <li>nums1.length == m + n</li>
 * <li>nums2.length == n</li>
 * <li>0 <= m, n <= 200</li>
 * <li>1 <= m + n <= 200</li>
 * <li>-10^9 <= nums1[i], nums2[j] <= 10^9</li>
 * </ul>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class MergeSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeSortedArray practice = new MergeSortedArray();
		int[] num1 = { 1, 2, 3, 0, 0, 0 };
		int[] num2 = { 2, 5, 6 };
		practice.mergeBruteForce(num1, 3, num2, 3);

	}

	/**
	 * 
	 * This is simple soluting using System Array Copy and Sorting Array
	 * 
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public void mergeBruteForce(int[] nums1, int m, int[] nums2, int n) {
		System.arraycopy(nums2, 0, nums1, m, n);
		Arrays.sort(nums1);
	}

}
