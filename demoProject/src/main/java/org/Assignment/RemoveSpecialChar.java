package org.Assignment;

import java.util.stream.Collectors;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        // How to remove special character in a string that is lowercase.

        String str = "Hello!@# World#$";
        System.out.println(str.replaceAll("[^A-Z0-9 ]", ""));
    }
}
