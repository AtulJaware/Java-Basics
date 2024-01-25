package org.basics;

public class Pattern {
    public static void main(String[] args) {

//        Java program to print the following pattern
//                5432*
//                543*1
//                54*21
//                5*321
//                *4321

//        String s="54321";
//        for(int i=s.length()-1;i>=0;i--){
//            System.out.println(s.replace(s.charAt(i),'*'));
//        }


//        for (int i = 0; i < 5; i++) {
//            for (int j = 5 - 1; j >= 0; j--) {
//                if (j == i)
//                    System.out.print("*");
//                else
//                    System.out.print(5 - j);
//            }
//            System.out.println();
//        }

        int n=5;
        for (int i=1; i<=n; i++) {
            for (int j=n; j>=1; j--) {
                if (j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

//        Given array of distinct integers, print all permutations of the array.

        int[] nums = {1, 2, 3};

    }
}
