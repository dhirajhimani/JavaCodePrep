package whiteboardsolutions.Ch01ArraysandStrings.Q8ZeroMatrix;

import java.util.Arrays;

public class ZeroMatrixUseExtraArray {

    public static void gerZeroMatrix(int[][] matrix) {
        int[] rowOfZeros = new int[matrix.length];
        int[] columnOfZeros = new int[matrix[0].length];

        Arrays.fill(rowOfZeros, -1);
        Arrays.fill(columnOfZeros, -1);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowOfZeros[i] = 0;
                    columnOfZeros[j] = 0;
                }
            }
        }

        for (int i = 0; i < rowOfZeros.length; i++) {
            if (rowOfZeros[i] == 0) {
                nullifyRow(matrix, i);
            }
        }

        for (int i = 0; i < columnOfZeros.length; i++) {
            if (columnOfZeros[i] == 0) {
                nullifyColumn(matrix, i);
            }
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    private static void nullifyColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0,2,3,4},
                {5,0,7,8},
                {9,1,1,2},
                {3,4,5,0},
        };
        gerZeroMatrix(matrix);

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


}
