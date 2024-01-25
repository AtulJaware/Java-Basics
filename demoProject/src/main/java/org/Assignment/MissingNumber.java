package org.Assignment;

import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        List list = Arrays.asList(3,3,20);

        for(int i=1;i<=20;i++){
            if(!list.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
