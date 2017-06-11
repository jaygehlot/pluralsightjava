package com.pluralsight;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

import org.junit.Test;

/**
 * Created by c1900406 on 14/07/2015.
 */
public class LeapYearTest {
    //number year is number leap year if it is divisible by 4,
    //years divisible by 100 are not leap years, except
    //years divisible by 400

    @Test
    public void leapYearsAreDivisibleByFour() {
        assertTrue(Leap.isLeapYear(2016));
    }

    @Test
    public void normalYearsAreNotDivisibleByFour() {
        assertFalse(Leap.isLeapYear(3));
    }

    @Test
    public void leapYearsAreNotDivisibleByOneHundred() {
        assertFalse(Leap.isLeapYear(1900));
    }

    @Test
    public void leapYearsAreDivisibleByFourHundred() {
        assertTrue(Leap.isLeapYear(2000));
    }
}
