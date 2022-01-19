/**
 * 
 */
package com.dsa.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 
 * <b>Leet Code - 350. Intersection of Two Arrays II<b> <br>
 * <br>
 * Given two integer arrays nums1 and nums2, return an array of their
 * intersection. Each element in the result must appear as many times as it
 * shows in both arrays and you may return the result in any order.<br>
 * <br>
 * 
 * Example<br>
 * 
 * Input: <br>
 * nums1 = [1,2,2,1], nums2 = [2,2]<br>
 * Output: [2,2] <br>
 * 
 * Constraints: <br>
 * 
 * 1 <= nums1.length, nums2.length <= 1000 <br>
 * 0 <= nums1[i], nums2[i] <= 1000 <br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class IntersectionofTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntersectionofTwoArrays practice = new IntersectionofTwoArrays();
		int[] num1 = { 1, 2, 2, 1, 5 };
		int[] num2 = { 2, 2, 1, 3, 1, 3, 1, 6, 5 };
		System.out.println(Arrays.toString(practice.intersectHashMap(num1, num2)));
		System.out.println(Arrays.toString(practice.intersectSortingTwoPointer(num1, num2)));

	}

	/**
	 * This method is used Hashmap to identify the intersection
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersectHashMap(int[] nums1, int[] nums2) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums1.length; i++) {
			if (map.containsKey(nums1[i])) {
				int value = map.get(nums1[i]).intValue();
				map.replace(nums1[i], value + 1);
			} else {
				map.put(nums1[i], 1);
			}
		}

		for (int i = 0; i < nums2.length; i++) {
			if (map.containsKey(nums2[i]) && map.get(nums2[i]).intValue() > 0) {
				arr.add(nums2[i]);
				map.replace(nums2[i], map.get(nums2[i]).intValue() - 1);
			}
		}

		return arr.stream().mapToInt(i -> i).toArray();
	}

	/**
	 * 
	 * This method is used Two Pointer to identify the intersection
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public int[] intersectSortingTwoPointer(int[] nums1, int[] nums2) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0;

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				arr.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}
		}

		return arr.stream().mapToInt(Integer::intValue).toArray();
	}

}
