package org.example;

public class CamelCase2 {
    public static void main(String[] args) {
        String input = "welcome to java world";
        String camelCase = convertToCamelCase(input);
        System.out.println("Input: " + input);
        System.out.println("Camel case: " + camelCase);
    }

    public static String convertToCamelCase(String input) {
        StringBuilder camelCase = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == ' ') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                camelCase.append(Character.toUpperCase(currentChar));
                capitalizeNext = false;
            } else {
                camelCase.append(Character.toLowerCase(currentChar));
            }
        }

        return camelCase.toString();
    }
}
