package org.basics;

public class Demo1 {
    public static void main(String[] args) {
        // 1) write a program To count number of words in a given sentence.
        String s="Hello world";
        String [] arr=s.split(" ");
        System.out.println(arr.length);

        // 2) write program to check whether a number is palindrome or not

        int num=121;
        int n=num;
        int rev = 0;
        while (n!=0) {
            int rem = n % 10;
            rev=rev*10 + rem;
            n=n/10;
        }
        if(num==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        // 3) Given an "out" string length 4, such as "<<>>", and a word,
        // return a new string where the word is in the middle of the out string, e.g. "<<word>>".
        // Note: use str.substring(i, j) to extract the String starting at index i and going up to
        // but not including index j.
        System.out.println(makeOutWord("[[]]", "word"));
        System.out.println(makeOutWord("<<>>","Yay"));

        // 4) Write a Java program to create a new string repeating every character twice of a given string.
        //  The given string is: welcome
        //   The new string is: wweellccoommee

        String s4="welcome";
        String newS4="";
        for(int i=0;i<s4.length();i++){
            newS4=newS4+s4.charAt(i)+s4.charAt(i);
        }
        System.out.println(newS4);

        // 5) Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
        String s5="WooHoo";
        System.out.println(s5.substring(0,s5.length()/2));

    }
    public static String makeOutWord(String out, String word) {
        int n = out.length() / 2;
        String res = out.substring(0, n)+word+out.substring(n);
        return res;
    }
}
