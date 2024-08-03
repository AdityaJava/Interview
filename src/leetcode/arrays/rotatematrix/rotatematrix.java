package leetcode.arrays.rotatematrix;

public class rotatematrix {

    private void rotateMatrixBy90Degree(int[][] matrix) {

    }

    private void transposeMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row != column) {

                }
            }
        }

    }

    private void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void main(String[] args) {

    }
}
