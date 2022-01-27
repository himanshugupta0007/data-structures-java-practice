/**
 * 
 */
package com.dsa.practice.array;

import java.util.Arrays;

/**
 * 
 * <b>Leet Code - 832. Flipping an Image<b> <br>
 * <br>
 * <br>
 * Given an n x n binary matrix image, flip the image horizontally, then invert
 * it, and return the resulting image. <br>
 * <br>
 * To flip an image horizontally means that each row of the image is reversed.
 * <br>
 * <br>
 * For example, flipping [1,1,0] horizontally results in [0,1,1]. To invert an
 * image means that each 0 is replaced by 1, and each 1 is replaced by 0. <br>
 * <br>
 * For example, inverting [0,1,1] results in [1,0,0]. <br>
 * 
 * Example<br>
 * 
 * Input: image = [[1,0,0],[1,0,1],[0,0,0]]<br>
 * Output: [[1,0,0],[0,1,0],[1,1,1]] <br>
 * Explanation:<br>
 * First reverse each row: [[0,1,1],[1,0,1],[0,0,0]] <br>
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]] <br>
 * 
 * Constraints: <br>
 * 
 * n == image.length <br>
 * n == image[i].length <br>
 * 1 <= n <= 20 <br>
 * images[i][j] is either 0 or 1 <br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class FlippingAnImage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FlippingAnImage practice = new FlippingAnImage();
		int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		System.out.println(Arrays.deepToString(practice.flipAndInvertImage(image)));
		System.out.println(Arrays.deepToString(practice.flipAndInvertImageSecondWay(image)));

	}

	/**
	 * This method flips and inverts the image
	 * 
	 * @param image
	 * @return flippedImageMatrix
	 */
	public int[][] flipAndInvertImage(int[][] image) {
		int numberOfRow = image.length;
		int numberOfCols = image[0].length;
		if (image == null || numberOfRow == 0 || numberOfCols == 0) {
			return image;
		}
		for (int row = 0; row < numberOfRow; row++) {
			int k = numberOfCols - 1;
			for (int col = 0; col < numberOfCols / 2; col++) {
				// swap the bit using XOR operator
				image[row][col] = image[row][col] ^ image[row][k];
				image[row][k] = image[row][col] ^ image[row][k];
				image[row][col] = image[row][col] ^ image[row][k];
				k--;
			}
		}
		//invert the elements
		for (int row = 0; row < numberOfRow; row++) {
			for (int col = 0; col < numberOfCols; col++) {
				// inverse the bit using XOR with 1
				image[row][col] = image[row][col] ^ 1;
			}

		}
		return image;
	}

	/**
	 * @param image
	 * @return
	 */
	public int[][] flipAndInvertImageSecondWay(int[][] image) {
		for (int i = 0; i < image.length; i++) {
			int start = 0, end = image[i].length - 1;
			// Flipping
			while (start <= end) {
				int temp = image[i][end];
				image[i][end] = image[i][start];
				image[i][start] = temp;
				start++;
				end--;
			}
			// Revert
			for (int j = 0; j < image[i].length; j++) {
				image[i][j] = (image[i][j] == 0) ? 1 : 0;
			}
		}
		return image;
	}

}
