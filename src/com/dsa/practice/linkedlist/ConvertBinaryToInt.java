/**
 * 
 */
package com.dsa.practice.linkedlist;

/**
 * 
 * <b>Leet Code - 1290. Convert Binary Number in a Linked List to Integer<b>
 * <br>
 * <br>
 * Given head which is a reference node to a singly-linked list. The value of
 * each node in the linked list is either 0 or 1. The linked list holds the
 * binary representation of a number.<br>
 * <br>
 * Return the decimal value of the number in the linked list. <br>
 * 
 * Example<br>
 * 
 * Input: head = [1,0,1]<br>
 * Output: 5<br>
 * Explanation:(101) in base 2 = (5) in base 10<br>
 * 
 * Constraints: <br>
 * 
 * The Linked List is not empty.<br>
 * Number of nodes will not exceed 30. <br>
 * Each node's value is either 0 or 1. <br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class ConvertBinaryToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConvertBinaryToInt practice = new ConvertBinaryToInt();
	}

	/**
	 * This method converts base2 to base 10
	 * 
	 * @param head
	 * @return
	 */
	public int getDecimalValue(ListNode head) {
		int sum = 0;
		while (head != null) {
			sum = (sum * 2) + head.val;
			// traverse till tail of linked list
			head = head.next;
		}
		return sum;
	}
}
