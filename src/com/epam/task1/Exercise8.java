package com.epam.task1;

/**
 *
 */
public class Exercise8 {
    /**
     * Find sum multiples of a given number
     *
     * @param k      number entered user
     * @param values array of natural numbers
     * @return sum elements multiples of a given number
     */
    public static double calculationSum(int k, int... values) throws Exception {
        int sum = 0;
        for (int v : values) {
            if (v == 0 || v < 0) {
                throw new Exception("Array contains no natural numbers.");
            }
            if (v % k == 0) {
                sum += v;
            }
        }
        return sum;
    }
}
