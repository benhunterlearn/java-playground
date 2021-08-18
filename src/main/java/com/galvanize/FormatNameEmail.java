package com.galvanize;

public class FormatNameEmail {
    public static String format(String[] args) {
        /*
        Input: "Angelica Schuyler" agelica@example.com
        Output: Angelica Schuyler <angelica@example.com>
         */
        String name = args[0];
        String email = args[1];

        return name + " <" + email + ">";
    }
}
