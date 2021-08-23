package com.galvanize;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AccumulatorTest {

    @Test
    void sum() {
        Accumulator accumulator = new Accumulator();
        ArrayList <Integer> integerArrayList = new ArrayList<>(Arrays.asList(1,2,3,4));
        Integer expectedSum = integerArrayList.stream().reduce(Integer::sum).get();

        expectedSum = integerArrayList.stream().mapToInt(Integer::valueOf).sum();

//        expectedSum = Integer.valueOf(1 + 2 + 3 + 4);

        Integer actualSum = accumulator.sum(integerArrayList);

        assertEquals(expectedSum, actualSum);

//                .toArray(new int[integerArrayList.size()])).sum();
    }

    @Test
    void shortWordsSplitByCommaTest() {
        String input = "one,toolong,short";
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList("one", "short"));
        Accumulator accumulator = new Accumulator();

        List<String> actualOutput = accumulator.shortWordsSplitByComma(input, 5);

        assertEquals(expectedOutput, actualOutput);
    }
}