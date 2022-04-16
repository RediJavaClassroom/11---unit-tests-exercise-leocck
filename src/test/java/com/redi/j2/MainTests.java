package com.redi.j2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MainTests {

    @Test
    void findHighestNumber_shouldWorkWhenNumberIsInFirstPosition() {

        // given - the Main class
        Main m = new Main();

        // and - an array where the highest number is in the first position
        int[] input = {5, 4, 3, 2, 1, 0};

        // when - we call the method
        int result = m.findHighestNumber(input);

        // then - the result is the highest number
        assertEquals(5, result,
                "Method 'findHighestNumber' does not work properly for input " + Arrays.toString(input));
    }

    @Test
    void findHighestNumber_shouldWorkWhenNumberIsInLastPosition() {

        // given - the Main class
        Main m = new Main();

        // and - an array where the highest number is in the last position
        int[] input = {0, 1, 2, 3, 4, 5};

        // when - we call the method
        int result = m.findHighestNumber(input);

        // then - the result is the highest number
        assertEquals(5, result,
                "Method 'findHighestNumber' does not work properly for input " + Arrays.toString(input));
    }

    @Test
    void findHighestNumber_shouldWorkWhenNumberIsInTheMiddle() {

        // given - the Main class
        Main m = new Main();

        // and - an array where the highest number is in the middle
        int[] input = {0, 4, 5, 3, 1, 2};

        // when - we call the method
        int result = m.findHighestNumber(input);

        // then - the result is the highest number
        assertEquals(5, result,
                "Method 'findHighestNumber' does not work properly for input " + Arrays.toString(input));
    }

    @Test
    void findHighestNumber_shouldWorkWhenArrayHasDuplicates() {

        // given - the Main class
        Main m = new Main();

        // and - an array with duplicates
        int[] input = {5, 4, 3, 5, 4, 0};

        // when - we call the method
        int result = m.findHighestNumber(input);

        // then - the result is the highest number
        assertEquals(5, result,
                "Method 'findHighestNumber' does not work properly for input " + Arrays.toString(input));
    }

    @Test
    void findHighestNumber_shouldWorkWhenArrayHasOnlyOneItem() {

        // given - the Main class
        Main m = new Main();

        // and - an array with duplicates
        int[] input = {7};

        // when - we call the method
        int result = m.findHighestNumber(input);

        // then - the result is the highest number
        assertEquals(7, result,
                "Method 'findHighestNumber' does not work properly for input " + Arrays.toString(input));
    }

    @Test
    void findHighestNumber_shouldWorkWhenArrayIsEmpty() {

        // given - the Main class
        Main m = new Main();

        // and - an empty array
        int[] input = {};

        // when - we call the method
        int result = m.findHighestNumber(input);

        // then - the result must be -1
        assertEquals(-1, result,
                "Method 'findHighestNumber' does not work properly for input " + Arrays.toString(input));
    }

    @Test
    void findHighestNumber_shouldWorkWhenArrayIsNull() {

        // given - the Main class
        Main m = new Main();

        // when - we call the method with null
        int result = m.findHighestNumber(null);

        // then - the result must be -1
        assertEquals(-1, result,
                "Method 'findHighestNumber' does not work properly for input = null");
    }
}
