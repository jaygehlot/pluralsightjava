package com.pluralsight;

/**
 * Created by c1900406 on 14/07/2015.
 */
public class Leap {

    public static boolean isLeapYear(final int year) {
        return isDivisible(year, 4) && (!isDivisible(year, 100) || isDivisible(year, 400));
    }

    private static boolean isDivisible(final int year, final int denominator) {
        return year % denominator == 0;
    }
}
