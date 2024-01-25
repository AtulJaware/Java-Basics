package org.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindSpecialChar {
    public static void main(String[] args) {
        // Find number of special character from string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str =sc.nextLine();
//      String str = "anu-sri.kondeti@capgemini.com";
        long cnt=str.chars().filter(ch->!Character.isLetterOrDigit(ch)).count();
        int count =0;

        for (int i=0; i<str.length();i++) {
            char ch = str.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                count++;
            }
        }
        System.out.println("No.of Special Character : "+count);
    }
}
