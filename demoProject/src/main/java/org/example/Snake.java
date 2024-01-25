package org.example;

public class Snake {
    public static void main(String [] args){
        String s="abhishek";
       String s1=s.toUpperCase();
       String u="";

        for(int i=0;i<s.length();i++){
            if(i%2==0){
                u=u+s1.charAt(i);
            }
            else{
                u=u+s.charAt(i);
            }
        }
//        System.out.println(s);
//        System.out.println(s1);
        System.out.println(u);

    }
}
