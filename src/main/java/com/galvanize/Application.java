package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Application {
    public static void main(String[] args) {



//        Fruit banana = new Fruit();
//        banana.setSize("for scale");
//        banana.setType("banana");
//        banana.setColor("black");
//
//        System.out.println(banana.toString());
    }

    void miscCode() {
//        System.out.println(args[0] + " <" + args[1] + ">");

        System.out.println("hello world");
        System.out.println(Application.constString());

        // test isActive()
        System.out.println(Application.isActive("active"));

        // test grade()
        System.out.println(Application.grade(100));  // A
        assert Application.grade(100).equals("A");

        System.out.println(Application.grade(80));  // B
        System.out.println(Application.grade(79));  // C
        System.out.println(Application.grade(60));  // D
        System.out.println(Application.grade(59));  // F
        System.out.println(Application.grade(0));  // F
        System.out.println(Application.grade(-1));  // F
        System.out.println(Application.grade(111));  // A

        // while loop
        // Using a while loop, print the integers from 45 through 50 to the console.
        int x = 45;
        while (x <= 50) {
            System.out.println(x++);
        }

        // for loop
        // Using a for loop, print the even integers from 2 through 6 to the console.
        for (int i = 2; i <= 6; i += 2) {
            System.out.println(i);
        }

        String one = "word";
        String two = "word";

        Application.test_FormatNameEmail();
    }

    public static String constString() {
        return "CONSTANT";
    }

    public static boolean isActive(String status) {
        return status.equals("active");
    }

    public static String grade(int score) {
        String grade = null;
        if (score >= 90) {
            grade = "A";
        } else if (89 >= score && score >= 80) {
            grade = "B";
        } else if (79 >= score && score >= 70) {
            grade = "C";
        } else if (69 >= score && score >= 60) {
            grade = "D";
        } else if (59 >= score) {
            grade = "F";
        }
        return grade;
    }

    public static void test_FormatNameEmail() {
        assert false;
    }

    // Implement the sortArray method below
    public static ArrayList sortArray(String[] inputArray) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(inputArray));
        arrayList.sort(null);
        return arrayList;

        // doesn't work to sort() on same line as instantiation
        // new ArrayList returns a void
//        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(inputArray));
        // sort() returns a void
//        return arrayList.sort(null);

        // fails because the constructor and sort both return void
//        return (new ArrayList<>(Arrays.asList(inputArray))).sort(null);
    }

    public static HashMap<Integer, String> genHashMap() {
        /*
        For the given method signature, write an implementation that generates a HashMap,
         adds the following two items, and returns this new HashMap.

        The string, "Airplane", associated with key 747
        The string, "Laphroaig", associated with key 10
        */
        HashMap hashMap = new HashMap();
        hashMap.put(747, "Airplane");
        hashMap.put(10, "Laphroaig");

        return hashMap;
    }
}
