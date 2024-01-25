package org.basics;

public class Max_Min_of_Array {
    public static void main(String[] args) {
        // Determine largest and smallest elements of an array , which is not sorted.

        int [] arr ={8,5,2,6,1,3,9};
        int min=arr[0];
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}
