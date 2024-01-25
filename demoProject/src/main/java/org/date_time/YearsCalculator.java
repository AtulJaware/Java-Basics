package org.date_time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class YearsCalculator {

    public static int calculateYears(String currentDate, String givenDate) {
        // Define the date format
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parse the current date and given date
        LocalDate currentDateObj = LocalDate.parse(currentDate, dateFormatter);
        LocalDate givenDateObj = LocalDate.parse(givenDate, dateFormatter);

        // Calculate the difference between the two dates
        Period period = Period.between(givenDateObj, currentDateObj);
        int years = period.getYears();
        return years;
    }

    public static void main(String[] args) {
        String currentDate = "31/07/2023"; // Replace this with the current date
        String givenDate = "31/07/1990";   // Replace this with the given date

        int years = calculateYears(currentDate, givenDate);
        System.out.println("Number of years: " + years);
    }
}

