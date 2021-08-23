package com.galvanize;

import java.util.Arrays;
import java.util.List;

public class CastingPractice {
    List<Object> getPerson() {
        return Arrays.asList("Bob", "Builder", 5);
    }

    public static void main(String[] args) {
        CastingPractice cp = new CastingPractice();
        System.out.println(cp.getPerson());
        System.out.println(cp.getPerson().get(0));

        // cast to String here
        String firstName = (String) cp.getPerson().get(0);
        System.out.println(firstName);

        // try to cast to Integer, exception will be thrown
        Integer age = (Integer) cp.getPerson().get(1);
        System.out.println(age);
    }
}
