package org.basics;

// Remove a word from given string

public class RemoveText {
    public static void main(String[] args) {
        String s= "Exercises Practice Solution";
        String remove="Solution";

        String res=s.replace(remove,"");
        System.out.println(res);

    }
}
