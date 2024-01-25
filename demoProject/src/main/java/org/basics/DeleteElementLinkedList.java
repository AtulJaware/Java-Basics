package org.basics;

import java.util.*;

public class DeleteElementLinkedList {
    public static void main(String[] args) {
        // what is process of deleting matched element from a LinkedList which is not sorted.

        LinkedList<String> linkedList= new LinkedList<>();
        linkedList.add("oppo");
        linkedList.add("vivo");
        linkedList.add("samsung");
        linkedList.add("oppo");               // duplicate element
        linkedList.add("apple");
        linkedList.add("oneplus");
        linkedList.add("vivo");               // duplicate element

        HashSet<String> hashSet=new HashSet<>();
        String [] arr;
        int count=0;

      for(int i=0;i<linkedList.size();i++){
            String element= linkedList.get(i);

        }
        System.out.println(linkedList);
    }

    public static class QuickSort {
        public static void main(String[] args) {

            int[] array = {7, 2, 9, 5, 1, 3, 6, 8, 4};
            quickSort(array, 0, array.length - 1);
            printArray(array);
        }
        public static void quickSort(int[] array, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(array, low, high);
                quickSort(array, low, pivotIndex - 1);
                quickSort(array, pivotIndex + 1, high);
            }
        }

        public static int partition(int[] array, int low, int high) {
            int pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (array[j] <= pivot) {
                    i++;
                    swap(array, i, j);
                }
            }
            swap(array, i + 1, high);
            return i + 1;
        }

        public static void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        public static void printArray(int[] array) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
