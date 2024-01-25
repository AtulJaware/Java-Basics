package org.basics;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MagicNumber {
    public static void main(String[] args) throws InterruptedException {
//  Design a program to display magic number, accept a number and check it is a magic number or not.

        magic();

    }

    public static void magic() throws InterruptedException {
        // First logic
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
          int n = sc.nextInt();
//        int temp, rem;
//        int sum = 0;
//        temp = n;
//        while (temp > 9) {
//            sum = 0;
//            while (temp != 0) {
//                rem = temp % 10;
//                sum = sum + rem;
//                temp = temp / 10;
//            }
//            temp = sum;
//        }
//        if (sum == 1) {
//            System.out.println(n + " is a Magic Number");
//        } else {
//            System.out.println(n + " is not Magic Number");
//        }

        // Second Logic

        if (((n - 1) % 9) == 0) {
            System.out.println(n + " is a Magic Number");
        }
        else {
            System.out.println(n + " is not Magic Number");
        }
        TimeUnit.MILLISECONDS.sleep(1500);
        System.out.print("You Want to check another number? (y/n) : ");
        char c=sc.next().charAt(0);
        if(c=='y' || c=='Y') {
            magic();
        }
        else{
            System.out.println("Thank You....!");
        }
    }
}
