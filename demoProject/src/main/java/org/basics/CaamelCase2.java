package org.basics;

public class CaamelCase2 {
    public static void main(String[] args) {
        String g="bharatiya janata party";
       String [] arr= g.split(" ");
       for(int i=0;i<arr.length;i++){
           StringBuilder sb= new StringBuilder(arr[i]);
           sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
           arr[i]=sb.toString();
           System.out.print(arr[i]);
       }

    }
}
