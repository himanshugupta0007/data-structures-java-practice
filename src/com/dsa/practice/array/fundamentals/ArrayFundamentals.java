/**
 * 
 */
package com.dsa.practice.array.fundamentals;

/**
 * This class holds all fundamentals samples for Arrays
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class ArrayFundamentals {

	public static void main(String[] args) {
		ArrayFundamentals classObject = new ArrayFundamentals();
		int[] number = { 1, 2, 3, 4, 5 };
		classObject.displayNumber(number);
	}

	/**
	 * This method creates the Array of different types
	 */
	@SuppressWarnings("unused")
	private void createAnArray() {
		// declare an array and initialize the
		int[] age = { 1, 2, 3, 4, 5, 6 };

		// declares an array of type String that store 10 elements of String type
		String[] name = new String[10];

		// this initializes the Array element at provided indexs
		// set value at index 0
		name[0] = "Test";
		// set value at index 1
		name[1] = "Test1";
	}

	/**
	 * This method explains how to access an array and traverse an array
	 */
	@SuppressWarnings("unused")
	private void traverseArray() {
		int[] age = { 1, 2, 3, 4, 5, 6 };
		// using for loop, traverse index by index
		for (int i = 0; i < age.length; i++) {
			System.out.println("Age: " + age[i]);
		}

		// foreach loop without referenceing the indexes
		for (int i : age) {
			System.out.println("Age: " + i);
		}
	}

	/**
	 * This method helps to understand the ArrayOutOfBoundException
	 */
	@SuppressWarnings("unused")
	private void arrayException() {

		int[] age = { 1, 2 };
		// here loops tries to access the index 3
		// which is greater than the size of array
		for (int i = 0; i < age.length + 1; i++) {
			System.out.println("Age: " + age[i]);
		}
	}

	/**
	 * This method takes an array and prints the same
	 * 
	 * @param number
	 */
	private void displayNumber(int[] number) {
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}
}
