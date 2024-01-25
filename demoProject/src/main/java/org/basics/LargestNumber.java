package org.basics;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the n1 number :");
        int n1=sc.nextInt();
        System.out.println("Enter the n2 number :");
        int n2= sc.nextInt();
        if(n1>n2){
            System.out.println("n1 is Largest");
        }
        else if(n1==n2){
            System.out.println("n1 is equals to n2");
        }
        else{
            System.out.println("n2 is Largest");
        }
    }
}
