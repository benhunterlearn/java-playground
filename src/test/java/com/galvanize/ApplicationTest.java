package com.galvanize;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {

    @Test
    void sortArrayTest() {
        String[] input = {"beta", "alpha"};
        ArrayList<String> expectedOutput = new ArrayList<>(Arrays.asList("alpha", "beta"));

        ArrayList<String> actualOutput = Application.sortArray(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void genHashMapTest() {
        HashMap<Integer, String> expectedHashMap = new HashMap<>();
        expectedHashMap.put(747, "Airplane");
        expectedHashMap.put(10, "Laphroaig");

        HashMap<Integer, String> actualHashMap = Application.genHashMap();

        assertEquals(expectedHashMap, actualHashMap);
    }
}