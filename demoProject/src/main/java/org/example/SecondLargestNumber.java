package org.example;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 15, 30, 25};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second-largest number is: " + secondLargest);
    }

    public static int findSecondLargest(int[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}

