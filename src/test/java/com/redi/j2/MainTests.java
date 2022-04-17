package com.redi.j2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideHasDuplicatesParams")
    void hadDuplicates_shouldWorkProperlyWith(String testType, List<Integer> numbers, boolean expectedResult) {

        // given - the Main class
        Main m = new Main();

        // when - we call the method
        boolean result = m.hasDuplicates(numbers);

        // expected - the correct result
        assertEquals(expectedResult, result, "Method does not work correctly for input "+numbers);
    }

    private static Stream<Arguments> provideHasDuplicatesParams() {
        return Stream.of(
                Arguments.of("No Duplicates", List.of(1, 2, 3, 4, 5), false),
                Arguments.of("One Duplicated Value", List.of(1, 2, 1, 4, 5), true),
                Arguments.of("Two Duplicated Values", List.of(1, 2, 1, 4, 1), true),
                Arguments.of("Only One Item", List.of(1), false),
                Arguments.of("Empty Array", new ArrayList<Integer>(), false),
                Arguments.of("Null Value", null, false)
        );
    }
}
