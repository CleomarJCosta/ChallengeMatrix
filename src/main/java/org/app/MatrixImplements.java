package org.app;

public class MatrixImplements implements Matrix{
    @Override
    public void invertMatrix(int[][] matrix) throws Exception {
        MatrixUtils matrixUtils = new MatrixUtils();
        int size = matrix.length;
        if(!matrixUtils.isSquareMatrix(matrix)){
            throw new Exception("Inserted matrix is not a square matrix");
        }
        for(int i = 0; i< size; i++){
            int aux = matrix[i][i];
            matrix[i][i] = matrix[i][size - i -1];
            matrix[i][size - i-1] = aux;
        }
    }

    @Override
    public int countSubMatrix(int[][] A, int[][] B) {
        MatrixUtils matrixUtils = new MatrixUtils();
        int count = 0;
        int rowsA = A.length;
        int columnsA = A[0].length;
        int rowsB = B.length;
        int columnsB = B[0].length;
        for (int i = 0; i <= rowsA - rowsB; i++) {
            for (int j = 0; j <= columnsA - columnsB; j++) {
                if (matrixUtils.isSubMatrix(A, B, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

}
