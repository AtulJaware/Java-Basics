package org.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AscendingOrder {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(6,1,2,6,1,2);
        Collections.sort(list);
        //Descending order
//        for(int i= list.size()-1;i>=0;i--){
//            System.out.print(list.get(i)+" ");
//        }
//        Collections.reverse(list);
//        System.out.println(list);

    }
}
