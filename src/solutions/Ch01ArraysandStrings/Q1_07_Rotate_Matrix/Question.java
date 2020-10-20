package solutions.Ch01ArraysandStrings.Q1_07_Rotate_Matrix;

import solutions.CtCILibrary.CtCILibrary.*;

public class Question {

	public static boolean rotate(int[][] matrix) {
		if (matrix.length == 0 || matrix.length != matrix[0].length) return false; // Not a square
		int n = matrix.length;
		
		for (int layer = 0; layer < n / 2; layer++) {
			int last = n - 1 - layer;
			System.out.println("layer " + layer + " ");
			System.out.println("last " + last + " ");
			for(int i = layer; i < last; i++) {
				int offset = i - layer;

				System.out.println("i " + i + " ");
				System.out.println("offset  = i - layer = " + offset + " ");
				System.out.printf("top [%d][%d] " + " ", layer, i);
				System.out.println();
				System.out.println();
				int top = matrix[layer][i]; // save top


				System.out.printf("left [%d][%d] " + " ", last-offset, layer);
				System.out.printf("top [%d][%d] " + " \n", layer, i);
				// left -> top
				matrix[layer][i] = matrix[last-offset][layer];

				System.out.printf("bottom [%d][%d] " + " ", last, last - offset);
				System.out.printf("left [%d][%d] " + " \n", last-offset, layer);
				// bottom -> left
				matrix[last-offset][layer] = matrix[last][last - offset];

				System.out.printf("right [%d][%d] " + " ", i, last);
				System.out.printf("bottom [%d][%d] " + " \n", last, last - offset);
				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];

				System.out.printf("top [%d][%d] " + " ", layer, i);
				System.out.printf("right [%d][%d] " + " \n", i, last);
				// top -> right
				matrix[i][last] = top; // right <- saved top

				System.out.println();
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] matrix = AssortedMethods.randomMatrix(4, 4, 0, 9);
		AssortedMethods.printMatrix(matrix);
		rotate(matrix);
		System.out.println();
		AssortedMethods.printMatrix(matrix);
	}

}
