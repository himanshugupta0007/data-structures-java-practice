/**
 * 
 */
package com.dsa.practice.linkedlist;

import java.util.ArrayList;

/**
 * 
 * <b>Leet Code - 206. Reverse Linked List<b> <br>
 * <br>
 * <br>
 * Given the head of a singly linked list, reverse the list, and return the
 * reversed list <br>
 * 
 * Example<br>
 * 
 * Input: head = [1,2,3,4,5]<br>
 * Output: [5,4,3,2,1]<br>
 * 
 * Constraints: <br>
 * 
 * The number of nodes in the list is the range [0, 5000].<br>
 * -5000 <= Node.val <= 5000
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseLinkedList practice = new ReverseLinkedList();
		ListNode node = new ListNode(1);
		node.next = new ListNode(2, new ListNode(3, new ListNode(4, null)));
		practice.reverseList(node);
	}

	/**
	 * This method reverse the linked list using iterative method
	 * 
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		ListNode pNode = null;
		// create a current node equals to head
		ListNode currNode = head;
		while (currNode != null) {
			// save the next node to temp variable to save it from misplacing
			ListNode temp = currNode.next;
			// point current node to previous node
			currNode.next = pNode;
			// set privous node to current node
			pNode = currNode;
			// set current node to temp
			currNode = temp;
		}
		// after all process, previous node will become the head as the list is
		// reveresed now
		return pNode;
	}

}
