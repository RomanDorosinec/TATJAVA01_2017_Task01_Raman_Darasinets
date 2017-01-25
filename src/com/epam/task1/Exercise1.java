package com.epam.task1;

/**
 *
 */
public class Exercise1 {
    private int number;

    public Exercise1(int number) {
        this.number = number;
    }

    /**
     * Check whether the number of a four digit
     *
     * @return is true if number a four digit
     */
    private boolean checkCorrectNumber() {
        return Integer.toString(Math.abs(number)).length() == 4;
    }

    /**
     * Display true if statement is true
     *
     * @return is true if sum of the first two numbers is equal to the sum of the last two
     * @throws Exception entered is not a four-digit number
     */
    public boolean checkCorrectDigitNumber() throws Exception {
        char[] countNumber = Integer.toString(Math.abs(number)).toCharArray();
        int sumFirst = 0;
        int sumSecond = 0;
        if (checkCorrectNumber()) {
            for (int i = 0; i < countNumber.length / 2; i++) {
                sumFirst += Integer.parseInt(String.valueOf(countNumber[i]));
                sumSecond += Integer.parseInt(String.valueOf(countNumber[countNumber.length / 2 + i]));
            }
            return sumFirst == sumSecond;
        } else {
            throw new Exception("Entered is not a four-digit number");
        }
    }
}