package org.app;

public class Main {
    public static void main(String[] args) throws Exception {
      MatrixUtils matrixUtils = new MatrixUtils();
//
//        int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 } };
//
//        System.out.println(matrixUtils.isSquareMatrix(matriz1));
        MatrixImplements mat = new MatrixImplements();

        int[][] A = {
                {1, 2, 3, 4},
                {7, 8, 7, 8},
                {11, 12, 11, 12},
                {13, 14, 15, 16}
        };

        int[][] submatrixB = {
                {7, 8},
                {11, 12}
        };

        int count = mat.countSubMatrix(A, submatrixB);
        System.out.println("The submatrix B can be found " + count + " times in matrix A.");

        int[][] matrix = {
                {1, 2, 3},
                {7, 8, 7},
                {9, 0, 5}
        };

        try {
            mat.invertMatrix(matrix);
            matrixUtils.printMatrix(matrix);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }







    }
}