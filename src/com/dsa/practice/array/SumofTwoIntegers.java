/**
 * 
 */
package com.dsa.practice.array;

/**
 * 
 * <b>Leet Code - 371. Sum of Two Integers<b> <br>
 * <br>
 * Given two integers a and b, return the sum of the two integers without using
 * the operators + and -. <br>
 * 
 * Example<br>
 * 
 * Input: a = 1, b = 2<br>
 * Output: 3<br>
 * 
 * Constraints: <br>
 * 
 * -1000 <= a, b <= 1000 <br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class SumofTwoIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SumofTwoIntegers practice = new SumofTwoIntegers();
		System.out.println(practice.getSumJustToAddNumberPositiveNumber(4, 3));
		System.out.println(practice.getSum(-4, 3));
	}

	/**
	 * Efficient Approach
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int getSum(int a, int b) {
		int carry = 0;
		while (b != 0) {
			// carry now contains common set bits of x and y
			carry = a & b;
			// XOR will give sum if both digits did not have set bit at same position
			a = a ^ b;
			// shifting carry to 1 bit
			b = carry << 1;
		}
		return a;
	}

	/**
	 * This returns the sum
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int getSumJustToAddNumberPositiveNumber(int a, int b) {
		StringBuffer string = new StringBuffer();
		boolean carry = false;
		while (a > 0 || b > 0) {

			if (a % 2 == 0 && b % 2 == 0) {
				if (carry) {
					string.append(1);
					carry = false;
				} else {
					string.append(0);
				}

			} else if ((a % 2 != 0 && b % 2 == 0) || (a % 2 == 0 && b % 2 != 0)) {
				if (carry) {
					string.append(0);
					carry = true;
				} else {
					string.append(1);
				}
			} else {
				if (carry) {
					string.append(1);
					carry = true;
				} else {
					string.append(0);
					carry = true;
				}
			}

			a = a >> 1;
			b = b >> 1;

		}
		if (carry) {
			string.append(1);
		}

		return Integer.parseInt(string.reverse().toString(), 2);
	}

}
