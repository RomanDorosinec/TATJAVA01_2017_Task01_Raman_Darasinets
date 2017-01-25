package com.epam.task1.Exercise7;

import java.util.ArrayList;

/**
 *
 */
public class Exercise7 {
    /**
     * Generates the result according to the value of the argument
     *
     * @param a the left boundary of the interval
     * @param b the right boundary of the interval
     * @param h step function
     * @return list with all information about argument and result of fanction
     */
    public static ArrayList<String> calculationValues(double a, double b, double h) {
        ArrayList<String> resultFunction = new ArrayList<>();
        double x = a;
        while (x < b) {
            resultFunction.add("| " + String.format("%.3f", x) + " | " + function(x));
            x += h;
        }
        return resultFunction;
    }

    /**
     * Calculates the value of the function
     *
     * @param x argument function
     * @return value of function
     */
    private static double function(double x) {
        double f = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
        return f;
    }
}
