package com.epam.task1.Exercise9;

/**
 *
 */
public class Exercise9 {
    /**
     * Unite two dimensional array in one a specific position
     *
     * @param array1 dimensional array
     * @param array2 dimensional array
     * @param k      natural number
     * @return combined array
     */
    public static double[] unionArrays(double[] array1, double[] array2, int k) throws Exception {
        check(k);
        double[] array3 = new double[array1.length + array2.length];
        boolean flag = false;
        for (int i = 0; i < array3.length; i++) {
            if (i == k) {
                flag = true;
                for (int j = 0; j < array2.length; i++, j++) {
                    array3[i] = array2[j];
                }
            }
            if (flag) {
                array3[i] = array1[i - array2.length];
            } else {
                array3[i] = array1[i];
            }
        }
        return array3;
    }

    /**
     * Check number which should be natural
     *
     * @param k natural number
     * @throws Exception if order of the matrix <= 0
     */
    private static void check(int k) throws Exception {
        if (k <= 0) {
            throw new Exception("Order of the matrix must be equal to zero and is greater than zero");
        }
    }
}
