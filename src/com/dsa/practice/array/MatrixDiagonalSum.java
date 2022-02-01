/**
 * 
 */
package com.dsa.practice.array;

/**
 * 
 * <b>Leet Code - 1572. Matrix Diagonal Sum<b> <br>
 * <br>
 * <br>
 * Given a square matrix mat, return the sum of the matrix diagonals. <br>
 * Only include the sum of all the elements on the primary diagonal and all the
 * elements on the secondary diagonal that are not part of the primary diagonal
 * <br>
 * For example, inverting [0,1,1] results in [1,0,0]. <br>
 * 
 * Example<br>
 * 
 * Input: mat = [[1,2,3],<br>
 * [4,5,6],<br>
 * [7,8,9]]<br>
 * Output: 25 <br>
 * Explanation:<br>
 * Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25 <br>
 * Notice that element mat[1][1] = 5 is counted only once.<br>
 * 
 * Constraints: <br>
 * 
 * n == mat.length == mat[i].length <br>
 * 1 <= n <= 100 <br>
 * 1 <= mat[i][j] <= 100<br>
 * 
 * @author Himanshu Gupta
 * @since JDK 1.8
 */
public class MatrixDiagonalSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MatrixDiagonalSum practice = new MatrixDiagonalSum();
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Dialgonal Sum: " + practice.diagonalSum(matrix));
	}

	/**
	 * This returns the diagonal sim
	 * 
	 * @param mat
	 * @return
	 */
	public int diagonalSum(int[][] mat) {
		int sum = 0;
		int row = mat.length;
		int col = mat[0].length;
		int top = col - 1;
		int j = 0;
		// run this loop for number of rows and increment the column along with the same
		// for first diagonal
		for (int i = 0; i < row; i++) {
			sum += mat[i][j];
			j++;
		}

		// this is for second diagonal
		// skip if number of row is equals to number of col
		for (int i = 0; i < row; i++) {
			if (i == top) {
				top--;
				continue;

			} else {
				// sum the value
				sum += mat[i][top];
				top--;
			}

		}
		return sum;
	}

}
