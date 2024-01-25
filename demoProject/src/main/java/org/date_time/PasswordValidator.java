package org.date_time;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        if (isValidPassword(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("'" + password + "' is an invalid password.");
        }
    }

    public static boolean isValidPassword(String password) {
        // Regex pattern for password validation
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$*#])[a-zA-Z@$*#0-9]{6,12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}

//(?=.*[a-z]): At least one lowercase letter.
//(?=.*[A-Z]): At least one uppercase letter.
//(?=.*[@$*#]): At least one of the allowed special characters: @, $, *, #.
//[a-zA-Z@$*#0-9]{6,12}: Allows only alphabets, numbers, and the specified special characters, with a length of 6 to 12 characters.
