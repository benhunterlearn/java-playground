package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Accumulator {
    public Integer sum(ArrayList<Integer> integerArrayList) {
        Integer sum = Integer.valueOf(0);

        for (int i = 0; i < integerArrayList.size(); i++) {
            sum += integerArrayList.get(i);
        }

        return sum;
    }

    public List<String> shortWordsSplitByComma(String input, int maxLength) {
        ArrayList<String> result = new ArrayList<>();

        String[] words = input.split(",");

        for (String word: words) {
            if (word.length() <= maxLength) {
                result.add(word);
            }
        }
        return result;
    }
}
