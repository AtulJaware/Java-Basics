package org.basics;

public class Alphabet_Digit_In_String {
    public static void main(String[] args) {
        // How can you check a string can only have alphabets and not digits.
        String s= "Atu2l";
        if(s.matches("[a-zA-z]+")){
            System.out.println("String having Alphabets only");
        }
        else{
            System.out.println("String contains Digit");
        }
    }
}
