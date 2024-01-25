package org.Assignment;

public class pal {
    public static void main(String[] args) {
        int num=111;
        int number=num;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if(num==reverse){
            System.out.println(num+" is a Palindrome number");
        }
        else {
            System.out.println(num+" is Not Palindrome number");
        }

    }
}
