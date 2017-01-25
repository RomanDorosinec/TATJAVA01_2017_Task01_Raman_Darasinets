package com.epam.task1.Exercise2;

/**
 *
 */
public class Exercise2 {
    /**
     * Calculates the value of the expression at the input values a, b, c
     *
     * @param a variable is is entered
     * @param b variable is is entered
     * @param c variable is is entered
     * @return expression value
     */
    public static double calculation(double a, double b, double c) throws Exception {
        check(a, b, c);
        return b + Math.sqrt(b * b + 4 * a * c) / 2 / a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }

    /**
     * Check entered values a, b, c
     *
     * @param a variable is is entered
     * @param b variable is is entered
     * @param c variable is is entered
     * @throws Exception root of a negative number, division by zero and out of range
     */
    private static void check(double a, double b, double c) throws Exception {
        if ((b * b + 4 * a * c) < 0) {
            throw new Exception("It is impossible to calculate the square root of a negative number.");
        }
        if (a < Double.MIN_VALUE || b < Double.MIN_VALUE) {
            throw new Exception("Division by zero.");
        }
        if (b > Math.pow(Double.MAX_VALUE, 0.5) || a > Math.pow(Double.MAX_VALUE, 0.25) || c > Math.pow(Double.MAX_VALUE, 0.25)) {
            throw new Exception("Out of range.");
        }
    }
}
