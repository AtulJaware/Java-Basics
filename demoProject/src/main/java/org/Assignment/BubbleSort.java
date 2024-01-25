package org.Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr ={9,3,8,5,10,2,1};

        // First Approach
        int temp;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int p:arr){
            System.out.print(p+" ");
        }

//        // Second Approach
//        List<Integer> list=Arrays.asList(9,3,8,5,10,2,1);
//        Collections.sort(list);
//        System.out.println(list);
    }
}
