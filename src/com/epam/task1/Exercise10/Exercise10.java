package com.epam.task1.Exercise10;

/**
 *
 */
public class Exercise10 {
    /**
     * Forms a matrix on the model: each even line 1 to n and not even line n to 1
     *
     * @param n order matrix
     * @return matrix n x n
     */
    public static int[][] matrixFormation(int n) throws Exception {
        check(n);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = j + 1;
                } else {
                    matrix[i][j] = n - j;
                }
            }
        }
        return matrix;
    }

    /**
     * Check order of the matrix
     *
     * @param n order matrix
     * @throws Exception if order of the matrix <= 0 or shouldn't be even
     */
    private static void check(int n) throws Exception {
        if (n % 2 != 0) {
            throw new Exception("Number should be even");
        }
        if (n <= 0) {
            throw new Exception("Order of the matrix must be equal to zero and is greater than zero");
        }
    }
}