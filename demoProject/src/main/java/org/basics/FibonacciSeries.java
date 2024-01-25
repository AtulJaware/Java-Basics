package org.basics;

import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n1=0,n2=1,n3;
        int count=10;
        System.out.print(n1+" "+n2);

        for(int i=2;i<count;++i){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();

        // Using java 8
        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(10)
                .forEach(x -> System.out.println("{" + x[0] + "," + x[1] + "}"));
    }
}
