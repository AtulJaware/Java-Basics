package org.Assignment;

public class PrimeNumBetween {
    public static void main(String[] args) {
        // Design a Prime Number between 2 to 30.
        int n=30;

        for(int i=2;i<=n;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(i+" ");
            }
        }
    }
}
