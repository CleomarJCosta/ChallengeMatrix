package org.app;

public class MatrixUtils {
    //impressão de matriz
    public void printMatrix(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    //método para retornar se uma matriz é quadrada
    public boolean isSquareMatrix(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;
        if(row == column){
            return true;
        }else{
            return false;
        }
    }

    // método para verificar se dimensão de B é menor do que a de A
    public boolean isSmallerTheDimension(int[][] A, int[][] B){
        int dimensionA = A.length;
        int dimensionB = B.length;
        if(dimensionB < dimensionA){
            return true;
        }else{
            return false;
        }
    }

    //método que verifica se Matriz B é subMatriz de A
    public boolean isSubMatrix(int[][] A, int[][] B, int initialRow, int initialColumn){
        int rowsB = B.length;
        int columnsB = B[0].length;
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < columnsB; j++) {
                if (A[initialRow + i][initialColumn + j] != B[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
