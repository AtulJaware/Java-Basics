package org.example;

public class Demo {
    public static void main(String [] args){
        int [] arr={10,20,30,50};
        int d=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            int c=arr[i+1]-arr[i];
            if(c!=d){
                System.out.println(arr[i]+d);
            }
        }
    }
}
