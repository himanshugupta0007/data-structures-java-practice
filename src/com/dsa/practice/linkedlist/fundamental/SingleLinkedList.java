/**
 * 
 */
package com.dsa.practice.linkedlist.fundamental;

import java.util.Iterator;

/**
 * This is our Single Link List class defined to create linked list
 * 
 * @author Himanshu Gupta
 *
 */
public class SingleLinkedList {

	// head of list
	public Node head;
	// tail of list
	public Node tail;
	// number of nodes in the list
	public int size;

	/**
	 * This method creates the Linked List
	 * 
	 * @param nodeValue
	 * @return node
	 */
	public Node createSingleLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		// first reference of node should be null
		node.reference = null;
		// node value should be the value we are sending
		node.value = nodeValue;
		// assign this node to head and tail, since there is only one node
		head = node;
		tail = node;
		// one node in this linked list
		size = 1;
		// return the head as single linked list, because of only one node in the list
		return head;

	}

	/**
	 * This method inserts the node at provided location
	 * 
	 * @param nodeValue
	 * @param nodeLocation
	 */
	public void insertNode(int nodeValue, int nodeLocation) {
		Node node = new Node();
		node.value = nodeValue;
		if (head == null) {
			// if head is null create a new linked list
			createSingleLinkedList(nodeValue);
			return;
		} else if (nodeLocation == 0) {
			// set node reference to head reference
			node.reference = head;
			// set head to node to
			head = node;
		} else if (nodeLocation >= size) {
			// set node next reference to null - tail has no reference of next node
			node.reference = null;
			// set tail reference to node
			tail.reference = node;
			// set node as tail
			tail = node;
		} else {
			// inserting at provided location
			// start with creating a temp node that points to head
			Node tempNode = head;
			int index = 0;
			// run loop until the location
			while (index < nodeLocation - 1) {
				// update the reference of tempnode to next node until the provided location
				tempNode = tempNode.reference;
				index++;
			}
			// saving the tempNode reference in the nextNode to insert the node at location
			// which pointed by temp node reference
			Node nextNode = tempNode.reference;
			// assign the tempNode Reference to node we created
			tempNode.reference = node;
			// assign the reference of our node to next node
			node.reference = nextNode;

		}
		// increase the size of linked list by one
		size++;

	}

	/**
	 * This method will traverse and print all values in the single linked list
	 */
	public void displaySingleLinkedList() {
		if (head == null) {
			System.out.println("List is Empty");
		} else {
			// assign a head to temp node
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				// print the node value
				System.out.print(tempNode.value);

				if (i != size - 1) {
					System.out.print("->");
				}
				// assign the tempNode with next node reference
				tempNode = tempNode.reference;
			}
		}
	}

	/**
	 * This method traverse the Linked List and check if the value is present in the
	 * linked list
	 * 
	 * @param nodeValue
	 * @return
	 */
	public boolean isNodePresent(int nodeValue) {
		Node tempNode = head;
		for (int i = 0; i < size; i++) {
			if (tempNode.value == nodeValue) {
				System.out.println("NodeValue is Present at Location: " + i);
				return true;
			}
			tempNode = tempNode.reference;
		}

		System.out.println("NodeValue is not present");
		return false;
	}

	/**
	 * This method removes the node for provided location
	 * 
	 * @param nodeValue
	 * @param localtion
	 */
	public void removeNode(int location) {

		if (head == null) {
			System.out.println("List is empty");
		} else if (location == 0) {
			// if location is 0, set head to head next reference
			head = head.reference;
			size -= 1;
			// if size if 0, means only one element is there in the list, set tail as null
			if (size == 0) {
				tail = null;
			}
		}
		// to delete from tail
		else if (location >= size) {
			Node tempNode = head;
			// get the reference of last node in the list
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.reference;
			}
			// if last reference is head, set head and tail as null
			if (tempNode == head) {
				head = tail = null;
				size--;
				System.out.println("Node is empty now");
			}
			// otherwise set tempNode reference to null and set tempNode as tail
			tempNode.reference = null;
			tail = tempNode;
			size--;
		} else {
			// this is scenairo to delete from provided location
			Node tempNode = head;
			for (int i = 0; i < location - 1; i++) {
				tempNode = tempNode.reference;
			}

			if (tempNode == head) {
				tail = null;
				size--;
			} else {
				// set the temopNode next reference to next to next node reference which breaks
				// the reference of next node
				tempNode.reference = tempNode.reference.reference;
				size--;
			}
		}

	}

	/**
	 * This method removes all the nodes from the list
	 */
	public void removeAllNodes() {
		// set head and tail next reference to null which breaks the link from list
		head = null;
		tail = null;
		size = 0;
		System.out.println("All Nodes deleted successfully");
	}
}
