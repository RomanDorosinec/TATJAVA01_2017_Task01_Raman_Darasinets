package com.epam.task1;

/**
 *
 */
public class Exercise5 {
    /**
     * Raise all positive numbers in the second degree, and negative in the fourth
     *
     * @param values enter numbers
     * @return negative numbers in the fourth degree, the positive square
     */
    public static double[] calculation(double... values) throws Exception {
        check(values);
        for (int i = 0; i < values.length; i++) {
            if (values[i] > 0) {
                values[i] = Math.pow(values[i], 2);
            } else {
                values[i] = Math.pow(values[i], 4);
            }
        }
        return values;
    }

    /**
     * Check input numbers
     *
     * @param values enter numbers
     * @throws Exception number should consist of three numbers and and if the number is out of range value
     */
    private static void check(double[] values) throws Exception {
        if (values.length != 3) {
            throw new Exception("Need three numbers.");
        }
        for (Double v : values) {
            if (v > 0) {
                if (v > Math.pow(Double.MAX_VALUE, 0.5)) {
                    throw new Exception("Out of range.");
                }
            } else {
                if (v > Math.pow(Double.MAX_VALUE, 1 / 3)) {
                    throw new Exception("Out of range.");
                }
            }
        }
    }
}
