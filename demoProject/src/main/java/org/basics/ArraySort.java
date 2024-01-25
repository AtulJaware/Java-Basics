package org.basics;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        // First logic
        int [] arr={1,9,3,8,2,34,0};
        Arrays.sort(arr);
             for (int i : arr) {
                 System.out.print(i+" ");
             }
        // Second logic
        Arrays.stream(arr).sorted();

    }
}
