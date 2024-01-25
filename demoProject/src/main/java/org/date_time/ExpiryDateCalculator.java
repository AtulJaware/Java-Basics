package org.date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class ExpiryDateCalculator {

    public static String calculateExpiryDate(String manufacturingDate) {
        // Define the date format for input and output
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Parse the manufacturing date
        LocalDate manufactureDate = LocalDate.parse(manufacturingDate, dateFormatter);

        // Calculate the expiry date by adding 6 months to the manufacturing date
        LocalDate expiryDate = manufactureDate.plusMonths(6);
        // Format the expiry date to the desired output format
        String formattedExpiryDate = expiryDate.format(dateFormatter);
        return formattedExpiryDate;
    }

    public static void main(String[] args) {
        String manufacturingDate = "31/07/2023"; // Replace this with the manufacturing date
        String expiryDate = calculateExpiryDate(manufacturingDate);
        System.out.println("Expiry Date: " + expiryDate);


    }
}
