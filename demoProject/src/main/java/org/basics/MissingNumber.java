package org.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,60,70};
        int d=arr[1]-arr[0];
        for(int i=0;i<arr.length-1;i++){
            int c=arr[i+1]-arr[i];
            if(c!=d){
                System.out.println(arr[i]+d);
            }
        }

        // missing number in list
        List<Integer> list = Arrays.asList(2, 30, 3);
        Collections.sort(list);
        for (int i = 1; i < list.get(list.size() - 1); i++) {
            if (list.contains(i)) {
                continue;
            } else {
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
