package org.Assignment;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
       int[] arr={2,3,5,6,3,3,3,2,3,5,0};
//       Arrays.sort(arr);
//        System.out.println(arr[arr.length-2]);

        int temp;
        for(int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int p:arr){
            System.out.print(p+" ");
        }
        System.out.println("\nSecond Largest : "+ arr[arr.length-2]);
    }
}
