package org.demo;

public class example3 {
    public static void main(String[] args) {
        String s= "Capgemini Training";
        StringBuilder sb= new StringBuilder(s);
        System.out.println(sb.reverse());

        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }

    }
}
