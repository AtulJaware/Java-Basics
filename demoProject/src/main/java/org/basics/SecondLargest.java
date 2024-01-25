package org.basics;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        // write a program to return 2nd largest number from given array
        int [] arr ={2,3,5,6,1,0};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);

        int t=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
            System.out.println(arr[arr.length-2]);

        // write a java program to replace A with O & P with Q in string
        String s ="apple";
        String res=s.replace('a','o').replace('p','q');
        System.out.println(res);

        //write a java program to extract Username from email.
        String email="john@capgemini.com";
        String username="";
        int m=email.indexOf('@');
        for(int i=0;i<m;i++){
                username=username+email.charAt(i);
            }
        System.out.println(username);
    }
}
