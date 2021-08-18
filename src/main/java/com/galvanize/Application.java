package com.galvanize;

public class Application {
    public static void main(String[] args) {
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
}
