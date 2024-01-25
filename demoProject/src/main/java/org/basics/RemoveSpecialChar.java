package org.basics;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        //How to remove special character in a string that is lowercase.

        String str="!capgemini@mumbai*india*123";
        String res=str.replaceAll("[^a-z0-9]","");
        System.out.println(res);
    }
}
