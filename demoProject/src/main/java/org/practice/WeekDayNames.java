package org.practice;

import java.util.Scanner;

public class WeekDayNames {
    public static void main(String[] args) {
//        Write a Java program that takes a number from the user and
//        generates an integer between 1 and 7. It displays the weekday name.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int number = scanner.nextInt();
        String weekdayName = week(number);
        System.out.println("Weekday: " + weekdayName);
    }

    public static String week(int number) {
        String weekdayName;
        switch (number) {
            case 1:
                weekdayName = "Monday";
                break;
            case 2:
                weekdayName = "Tuesday";
                break;
            case 3:
                weekdayName = "Wednesday";
                break;
            case 4:
                weekdayName = "Thursday";
                break;
            case 5:
                weekdayName = "Friday";
                break;
            case 6:
                weekdayName = "Saturday";
                break;
            case 7:
                weekdayName = "Sunday";
                break;
            default:
                weekdayName = "Invalid input";
                break;
        }
        return weekdayName;
    }
}
