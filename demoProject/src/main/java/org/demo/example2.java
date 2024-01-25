package org.demo;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String s= String.valueOf(n);
        int m=s.charAt(0);
        boolean flag=true;
        for(int i=1;i<s.length();i++){
            if(m<s.charAt(i)){
                m=s.charAt(i);
            }
            else{
                flag =false;
            }
        }
        if(flag){
            System.out.println("Increasing number");
        }
        else{
            System.out.println("Not an increasing number");
        }
    }
}
