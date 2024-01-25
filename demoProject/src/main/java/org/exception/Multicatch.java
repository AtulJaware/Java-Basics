package org.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Multicatch {

    public String getDuplicateElement() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the size of the array
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            if (size <= 0) {
                return "Array size should be positive";
            }

            // Create the array
            int[] array = new int[size];

            // Get the elements of the array
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // Get the index of the array
            System.out.print("Enter the index of the array to replicate: ");
            int index = scanner.nextInt();

            // Get the replicated element at the given index
            int replicatedElement = array[index];

            // Generate the result message
            StringBuilder result = new StringBuilder("The array elements are ");
            for (int i = 0; i < size; i++) {
                result.append(array[i]);
                if (i == index) {
                    result.append(" (replicated ").append(replicatedElement).append(")");
                }
                result.append(" ");
            }
            return result.toString();

        } catch (InputMismatchException e) {
            return "Input was not in the correct format";

        } catch (ArrayIndexOutOfBoundsException e) {
            return "Array index is out of range";

        } catch (NegativeArraySizeException e) {
            return "Array size should be positive";

        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        Multicatch ui = new Multicatch();
        String result = ui.getDuplicateElement();
        System.out.println(result);
    }
}

