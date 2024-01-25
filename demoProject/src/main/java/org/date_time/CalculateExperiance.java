package org.date_time;

import java.util.Date;
import java.util.InputMismatchException;

public class CalculateExperiance {
    public static void main(String[] args) {
        String join="21/08/2006";
        String curr="15/12/2020";

        Date joinDate= new Date(join);
        Date currDate= new Date(curr);

        long l = currDate.getTime() - joinDate.getTime();
        long msInYear = 31556952000L; // Approximation for an average year in milliseconds
        double diff= (double)l/msInYear;
        int year=(int)diff;
        System.out.println(year);
    }
}
