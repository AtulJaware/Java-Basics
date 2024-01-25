package org.basics;

import java.util.*;

public class ThirdHighest {
    public static void main(String[] args) {
        // Without changing original array order
        int [] arr={1,2,3,4,5,6,7,8,9};
        int [] ar= Arrays.stream(arr).sorted().toArray();
        System.out.println(ar[arr.length-3]);

        //Using sort method (it affect the order of original array)
        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);

        // Using For Loop
        int temp;
        for(int i = 0; i <arr.length; i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[arr.length-3]);
    }
}
