package org.app;

public interface Matrix {
    //função que inverte as diagonais de uma matriz quadrada.
    public abstract void invertMatrix(int[][] matrix) throws Exception;



    //função que retorna quantas vezes esta submatriz B
    //pode ser encontrada na matriz A.
    public abstract int countSubMatrix(int[][] A, int[][] B);
}
