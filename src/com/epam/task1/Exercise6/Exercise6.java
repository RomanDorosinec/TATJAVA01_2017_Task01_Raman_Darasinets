package com.epam.task1.Exercise6;

/**
 *
 */
public class Exercise6 {
    /**
     * Finding the amount of larger and smaller numbers
     *
     * @param values enter numbers
     * @return sum of larger and smaller numbers
     */
    public static double calculationSum(double... values) throws Exception {
        check(values);
        double max = values[0];
        double min = values[0];
        for (Double v : values) {
            if (v > max) {
                max = v;
            }
            if (v < min) {
                min = v;
            }
        }
        return max + min;
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
            if (v > Double.MAX_VALUE / 2) {
                throw new Exception("Out of range.");
            }
        }
    }
}
