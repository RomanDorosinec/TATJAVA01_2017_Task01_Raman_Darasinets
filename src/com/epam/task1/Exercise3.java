package com.epam.task1;

/**
 *
 */
public class Exercise3 {
    /**
     * Calculates perimeter of the triangle
     *
     * @param a side of rectangular triangle
     * @param b side of rectangular triangle
     * @return perimeter of the triangle
     */
    public static double calculatingPerimeter(double a, double b) throws Exception {
        check(a, b);
        return a + b + Math.sqrt(a * a + b * b);
    }

    /**
     * Calculates area of a triangle
     *
     * @param a side of rectangular triangle
     * @param b side of rectangular triangle
     * @return area of a triangle
     */
    public static double calculatingArea(double a, double b) throws Exception {
        check(a, b);
        return a * b / 2;
    }

    /**
     * Check side of triangle
     *
     * @param a side of rectangular triangle
     * @param b side of rectangular triangle
     * @throws Exception sid of triangle shouldn't: be negative, zero. Out of range side of triangle
     */
    private static void check(double a, double b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("Side triangle can not be negative.");
        }
        if (a < Double.MIN_VALUE || b < Double.MIN_VALUE) {
            throw new Exception("Triangle does not exist.");
        }
        if (b > Math.pow(Double.MAX_VALUE, 0.5) || a > Math.pow(Double.MAX_VALUE, 0.5)) {
            throw new Exception("Out of range.");
        }
    }
}
