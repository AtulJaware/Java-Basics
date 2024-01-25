package org.basics;

public class RotationMutually {
    public static void main(String[] args) {
        // How to verify if 2 strings are rotation mutually.
        String s1="ravi";
        String s2="vira";

        String s3=s1.concat(s2);
        if(s3.contains(s2)){
            System.out.println("Given String is rotation mutually");
        }
        else{
            System.out.println("Not rotation mutually");
        }
    }
}
