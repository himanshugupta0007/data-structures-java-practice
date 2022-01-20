/**
 * 
 */
package com.dsa.practice.linkedlist.fundamental;

/**
 * Test Class for Single Linked List
 * 
 * @author Himanshu Gupta
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleLinkedList slist = new SingleLinkedList();
		slist.createSingleLinkedList(123);
		//display the head value
		System.out.println("Value at head: "+ slist.head.value);
		//insert the node at begining
		slist.insertNode(6, 0);
		System.out.println("Head after inserting at Begining: "+ slist.head.value);
		slist.insertNode(99, 6);
		System.out.println("Tail after inserting last: "+ slist.tail.value);
		slist.insertNode(111, 1);
		System.out.println("Head after inserting at location 0: "+ slist.head.value);
		//adding few more nodes
		slist.insertNode(12, 2);
		slist.insertNode(13, 3);
		slist.displaySingleLinkedList();
	}
}
