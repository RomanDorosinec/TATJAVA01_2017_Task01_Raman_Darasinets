package com.epam.task1;

/**
 *
 */
public class Exercise4 {
    /**
     * Checks belonging point a specific area
     *
     * @param x X coordinate of the point
     * @param y Y coordinate of the point
     * @return if true if the point is in a predetermined area, if false is not in a predetermined area
     */
    public static boolean checkArea(double x, double y) {
        if (y <= 4 && y >= 0 && x >= -2 && x <= 2) {
            return true;
        }
        if (y <= 0 && y >= -3 && x >= -4 && x <= 4) {
            return true;
        }
        return false;
    }
}
