package com.galvanize;

public class Application {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println(Application.constString());
    }

    public static String constString() {
        return "CONSTANT";
    }
}
