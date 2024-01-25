package org.basics;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ReverseNumber {
    public static void main(String[] args) throws InterruptedException {
        reverse();
    }
    public static void reverse() throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();
        int rev=0;

        while(n!=0){
            int digit = n%10;
            rev= rev* 10 + digit;
            n/= 10;
        }
        System.out.println("Reverse Number : "+rev);
        TimeUnit.MILLISECONDS.sleep(1500);
        System.out.println("Do you want to check again ? (y/n) ");
        char c=sc.next().charAt(0);
        if(c=='y' || c=='Y'){
            reverse();
        }
        else{
            System.out.println("Thank You....!");
        }
    }
}
