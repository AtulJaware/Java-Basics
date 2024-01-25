package org.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThirdHighestNumber {
    public static void main(String[] args) {
        int [] arr={2,3,4,65,7,3};
        int [] ar= Arrays.stream(arr).sorted().toArray();
        System.out.println(ar[arr.length-3]);


        // Using Collection
        Integer [] arr2={2,3,4,65,7,3};
        List<Integer> list=Arrays.asList(arr2);
        Collections.sort(list);
        System.out.println(list.get(arr2.length-3));
    }
}
