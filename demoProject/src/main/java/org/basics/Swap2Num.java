package org.basics;

import java.util.Scanner;

public class Swap2Num {
    public static void main(String[] args) {
        // Swap 2 numbers without using 3rd variable.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n1 :");
        int n1=sc.nextInt();
        System.out.println("Enter n2 :");
        int n2=sc.nextInt();

      n1=n1+n2;
      n2=n1-n2;
      n1=n1-n2;
        System.out.println("After Swap :");
        System.out.println("n1 = "+n1);
        System.out.println("n2 = "+n2);

    }
}
